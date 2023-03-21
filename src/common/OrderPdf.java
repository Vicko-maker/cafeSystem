/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class OrderPdf {
    public static void openById(String id){
        try{
            if((new File("C:\\Users\\HP\\Downloads\\"+id+".pdf")).exists()){
                JOptionPane.showMessageDialog(null, "Successfully printed in downloads");
                //Process p;
                //p = Runtime
                        //.getRuntime()
                        //.exec("rund1132 url.dll, FileProtocolHandler C:\\Users\\HP\\Documents\\"+id+".pdf");
                        
            }
            else
                JOptionPane.showMessageDialog(null, "File is not Exists");
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
