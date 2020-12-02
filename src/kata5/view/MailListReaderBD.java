package kata5.view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import kata5.model.Mail;


public class MailListReaderBD {
   
  public static List <Mail> read (Connection connection) throws ClassNotFoundException, SQLException {
       List<Mail> list = new ArrayList<>();
       Class.forName("org.sqlite.JDBC");
       try (
           Statement statement = connection.createStatement()){
           ResultSet result = statement.executeQuery("SELECT * FROM PEOPLE");
           while (result.next()){
               String email = result.getString("email");
               if (Mail.isMail(email)){
                   list.add(new Mail(email)); 
               }
           }
       }
      return list;
       
    }
    
}
    

