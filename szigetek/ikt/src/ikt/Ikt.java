package ikt;
import java.io.*;

public class Ikt {
    public static String [] meresek = null;
    
    public static void a1(){
        
        int [] szigetek = null;
        
        for (int i = 0; i < meresek.length; i++) {
            
            int count = 0;
            
            if (meresek[i].equals("0") == false) {
                szigetek = new int[count];
                count++;
            }     
        }
        
    }
    
    public static void main(String[] args){
        
        RandomAccessFile raf;
        String row;
        
        //File beolvasása
        try{ 
            raf = new RandomAccessFile("szigetek.txt" , "r");
            int count = 0;
            
            for (row = raf.readLine(); row != null; row = raf.readLine()) {
                count++;
            }
            meresek = new String[count];
            raf.seek(0);
            count = 0;
            
            for (row = raf.readLine(); row != null; row = raf.readLine()){
                meresek[count] = row;
                count ++;
                
            }
            
            raf.close();
        }
        //Hiba esetén: 
        catch(IOException e){
            System.out.println("A file nem található");
        }
        a1();
    }
    
}
