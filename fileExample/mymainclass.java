import java.io.*;
import java.util.Scanner;

class mymainclass{

    public static void main(String[] args) {

        //creater file
        File f = new File("filename.txt");

        try {
            
            if(f.createNewFile()){
                System.out.println("File created : " + f.getName());
            }
            else {System.out.println("File exists");}
        } catch (Exception e) {
            System.out.println("error");
        }

        //check if file exists and write into it
        if(f.exists()){
          System.out.println(f.getAbsolutePath());
          System.out.println(f.canRead());
          try {
            FileWriter fw = new FileWriter("filename.txt");
            fw.write("Hello World");
            fw.close();
          } catch (Exception e) {
              System.out.println("error writing");
          }   

        }

        //read file
        try {
            File f2 =  new File("filename.txt");
            Scanner readfile = new Scanner(f2);
            while (readfile.hasNextLine()) {
                String data = readfile.nextLine();
                System.out.println(data);
            }
            readfile.close();
            
        } catch (Exception e) {
            System.out.println("error reading file");
        }
        
        
        
    }
}