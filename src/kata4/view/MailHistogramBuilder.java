package kata4.view;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;

public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<Mail> email){
        
         Histogram<String> histogram = new Histogram();
        
        for(Mail mail : email)
            histogram.increment(mail.getDomain());
        
        return histogram;
        
        
        
    }
    
    
}
