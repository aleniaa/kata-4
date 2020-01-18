package kata4.main;



import java.util.List;
import kata4.model.Mail;
import kata4.model.Histogram;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;



public class Kata4 {
   
    public static void main(String[] args){
        
        String fileName = new String("C:\\Users\\milen\\OneDrive\\Documenti\\email.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
        
        
      
        
        
        
        
        
        
        
        
    }
}
