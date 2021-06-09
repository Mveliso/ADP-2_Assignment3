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
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author Lwazi George Tomson
 */
public class ReadObject2 {
         public static void main(String args[])  {
    File f = new File("supplierOutFile.txt");
    try{
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Vector<Supplier> deserializedSupplier = (Vector<Supplier>) ois.readObject();
        System.out.println("=======================SUPPLIERS==================================");
        System.out.println("ID "+"     Name      "+"              Prod Type   "+   "    Discription      ");
        System.out.println("===================================================================");
            
      
        //System.out.println();
       // ois.close();
       
       
        Iterator<Supplier> iter = deserializedSupplier.iterator();
        while (iter.hasNext()){
            Supplier s = iter.next();
            System.out.println(s.toString());
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
