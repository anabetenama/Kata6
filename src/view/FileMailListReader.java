/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Mail;

public class FileMailListReader {
    public static List read(String name) throws FileNotFoundException, IOException{
        List<Mail> mailList = new ArrayList<>();
        Integer id=0;
        BufferedReader reader = new BufferedReader (new FileReader
                (new File(name)));
        String mail;
        while((mail=reader.readLine()) != null){
            if (!mail.contains("@")) continue;
            mailList.add(new Mail(mail, id));
            
        }
        reader.close();
        return mailList;
    }
}
