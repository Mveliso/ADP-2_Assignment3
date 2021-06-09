/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment3project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Vector;

/**
 *
 * @author Lwazi George Tomson
 */
public class WriteObject2 {
       public static void main(String args[])  {
    
       Supplier s;
        Vector<Supplier> v2 = new Vector<>();
        v2.add(new Supplier("S270", "Grand Theft Auto", "Toyota", "Mid-size sedan"));
         v2.add(new Supplier("S400", "Prime Motors", "Lexus", "Luxury sedan"));
         v2.add(new Supplier("S300", "We got Cars", "Toyota", "10-seater minibus"));
         v2.add(new Supplier("S350", "Auto Delight", "BMW", "Luxury SUV"));
         v2.add(new Supplier("S290", "MotorMania", "Hyundai", "compact budget"));
         
         
                   File f = new File("supplierOutFile.txt");
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(v2);
            oos.close();
            System.out.println("Data write successfully");
            
        } catch (FileNotFoundException ex) {
        ex.printStackTrace();
        } catch (IOException ex) {
          ex.printStackTrace();
        }
    
       }
}
