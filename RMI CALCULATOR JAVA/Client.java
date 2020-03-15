import java.rmi.*;
import java.util.Scanner;
public class Client
{
    public static void main(String args[]) throws Exception
    {
        AddI obj = (AddI)Naming.lookup("ADD");
        int n = obj.Add(5,4);

        System.out.println("Calculator implementing RMI");   
        System.out.println("1) Add 2)Sub  3) Mul 4) Div");
        System.out.println("Enter your choice (1 to 4) ::");
        Scanner in = new Scanner(System.in); 
        int ch = in.nextInt(); 
        System.out.println("Enter the value of ele 1: ");
       // Scanner in = new Scanner(System.in); 
        int ele1 = in.nextInt(); 
        System.out.println("Enter the value of ele 2: ");
        //Scanner in = new Scanner(System.in); 
        int ele2 = in.nextInt(); 

        switch(ch) {
            case 1:
            System.out.println("Addition is:: "+ obj.Add(ele1,ele2));
            break;

            case 2:
            int result = obj.Sub(ele1,ele2);
            if(result == -1) {
                System.out.println("ERROR First number is less than second number");
            } else {
                System.out.println("Subtraction is:: "+ obj.Sub(ele1,ele2)  );
             }
            break;

            case 3:
            System.out.println( "Multiplication is:: "+ obj.Mul(ele1,ele2));
            break;

            case 4:
            System.out.println( "Division is:: "+ obj.Div(ele1,ele2));
            break;

            default:
            System.out.println("Choice not available");

        }
    }
}