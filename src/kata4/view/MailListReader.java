package kata4.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import kata4.model.Mail;

public class MailListReader {
    
    static List<Mail> email = new ArrayList<>();
    
    public static List<Mail> read(String fileName){
        
        try{
            
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
        
            
            while (true){
                String line = reader.readLine();
                if(line == null)
                    break;
                if (Mail.isMail(line))
                    email.add(new Mail(line));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return email;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
