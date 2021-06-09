/**
 * @author Mveliso Roto 214211983
 * ADP2_Assignment-3
 * June 2021
 */
package za.ac.cput.assignment3project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.Vector;

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
