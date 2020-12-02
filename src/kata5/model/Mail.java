package kata5.model;


public class Mail {
    private final String mail;
    
    public Mail(String mail){
        this.mail = mail;
    }
    
    public String getDomain(){
        String sub = this.mail.substring(this.mail.indexOf("@")+1);
        if (sub.equals("gmail.com") == false && 
            sub.equals("hotmail.com") == false && 
            sub.equals("aol.com") == false && 
            sub.equals("cox.net") == false && 
            sub.equals("yahoo.com") == false)
        {
            sub="others";
        }
        return sub;
    }
    public static boolean isMail(String line){
        return line.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{​​|}​​~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
    }
    
}
