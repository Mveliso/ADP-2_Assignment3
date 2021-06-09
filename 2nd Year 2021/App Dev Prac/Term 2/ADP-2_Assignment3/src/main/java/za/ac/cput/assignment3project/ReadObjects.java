/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment3project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Vector;
import java.util.Iterator;

/**i
 *
 * @author Lwazi George Tomson
 */
public class ReadObjects {
       public static void main(String args[])  {
    File f = new File("customerOutFile.txt");
    try{
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Vector<Customer> deserializedCustomer = (Vector<Customer>) ois.readObject();
        System.out.println("====================================CUSTOMERS=============================================================");
        System.out.println("ID      "+"        Name       "+"     Surname       "+ "  Address       " + "  Date of birth "+"  Credit     "+"     Rent");
        System.out.println("==========================================================================================================");
            
      
       // System.out.println(deserializedCustomer);
        //ois.close();
        
        Iterator<Customer> iter = deserializedCustomer.iterator();
        while (iter.hasNext()){
            Customer c = iter.next();
            System.out.println(c.toString());
        }
           
        
        
      
    }catch (FileNotFoundException ex){
        ex.printStackTrace();
    }      catch (IOException ex) {
               ex.printStackTrace();
           } catch (ClassNotFoundException ex) {
             ex.printStackTrace();
           }
}
}