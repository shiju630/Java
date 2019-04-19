
import java.util.Scanner;

//main class

public class mainclass{
    
    public static void main(String[] args) {

        employeeprofession ep = new employeeprofession("sonia ",31," nurse ",5000);
        System.out.println(ep.toString());
        //ep.departmentname();

        Scanner obj = new Scanner(System.in);
        String line = obj.nextLine();
        System.out.println(line);
        obj.close();

        iamstatic();
        
    }

    //static menthods can be accesed without objects
    static void iamstatic(){
        System.out.println("dont need a object to call me");
    }
}