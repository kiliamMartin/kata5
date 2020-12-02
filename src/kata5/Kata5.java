package kata5;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import kata5.model.Histogram;
import kata5.model.Mail;
import kata5.view.HistogramDisplay;
import kata5.view.MailHistogramBuilder;
import kata5.view.MailListReaderBD;


public class Kata5 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       Connection connection = DriverManager.getConnection("jdbc:sqlite:data/us500.db");
      
       List<Mail> mailList = MailListReaderBD.read(connection);
       Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        
       HistogramDisplay histo = new HistogramDisplay("HISTOGRAM",histogram);
       histo.execute(); 
        
        
    }  
}
