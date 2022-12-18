import java.io.ObjectInputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Yajc{
    /**
     * @param args
     */
    public static void main(String[] args){
        String var3 = "https://www.newbiecontest.org/epreuves/javascript/";
        var3 = var3 + "credentials.o";
  
        try {
           URL var4 = new URL(var3);
          Credentials credentials = (Credentials)loadCredentials(var4);
          String pass=credentials.getPassword();
          String password=encrypt(pass);
           System.out.println(password);
        } catch (Exception var5) {
           var5.printStackTrace();
        }
    }
    
    public static String encrypt(final String s) {
      String string = new String("");
      for (int i = 0; i < s.length(); ++i) {
          string = (char)(s.charAt(i) ^ '|') + string;
      }
      return string;
  }
    

    public static Object loadCredentials(URL var1) {
        Object var2 = null;
  
        try {
           HttpURLConnection var4 = (HttpURLConnection)var1.openConnection();
           ObjectInputStream var3 = new ObjectInputStream(var4.getInputStream());
           var2 = var3.readObject();
           var3.close();
           var4.disconnect();
        } catch (Exception var6) {
           var6.printStackTrace();
        }
  
        return var2;
     }
}