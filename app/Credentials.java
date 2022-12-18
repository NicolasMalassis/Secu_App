import java.io.Serializable;

public class Credentials implements Serializable {
    private String login = "";
    private String password = "";
 
    public Credentials(String var1, String var2) {
       this.login = var1;
       this.password = var2;
    }
 
    public String getLogin() {
       return this.login;
    }
 
    public void setLogin(String var1) {
       this.login = var1;
    }
 
    public String getPassword() {
       return this.password;
    }
 
    public void setPassword(String var1) {
       this.password = var1;
    }
 
    public int checkPassword(String var1) {
       return var1.compareTo(this.password) == 0 ? 1 : 0;
    }
}
