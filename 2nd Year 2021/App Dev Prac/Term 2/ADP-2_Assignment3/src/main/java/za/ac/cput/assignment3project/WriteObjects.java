/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment3project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


public class WriteObjects {
    public static void main(String args[])  {
        Customer c;
        Vector<Customer> v = new Vector<>();
         v.add(new Customer("C150      ", "     Luke", "    Atmyass ", "    Bellville", "27 Jan 1981", 1520.50, false));
         v.add(new Customer("C130      ", "     Stu", "     Padassol    ", "    Sea Point   ", "18 May 1987", 645.25, true));
         v.add(new Customer("C100      ", "     Mike", "    Rohsopht    ", "`Bellville  ", "24 Jan1993", 975.10, true));
         v.add(new Customer("C300      ", "     Ivana.B", " Withew  ", "    Langa   ", "16 Ju 1998", 1190.50, false));
         v.add(new Customer("C250      ", "     Eileen", "  Sideways    ", "    Nyanga", "27 Nov1999", 190.85, true));
         v.add(new Customer("C260      ", "     Ima", "      Stewpidas  ", "    Atlantis    ", "27 Jan 2001", 1890.70, true));
       
        
       
         
         //Create file And write object to file
         File f = new File("customerOutFile.txt");
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(v);
            oos.close();
            System.out.println("Data write successfully");
            
        } catch (FileNotFoundException ex) {
        ex.printStackTrace();
        } catch (IOException ex) {
          ex.printStackTrace();
        }
        
        

        
    }
     
}
