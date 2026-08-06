//code to construct a simple calculator 
import java.util.*;

public class simplecalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //taking two numbers input from the user to perform the operation
        System.out.println("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        //taking character input which will indicate what operation to perform 
        //here this character will be used inside the switch case 

        System.out.println("Enter the operation to perform : ");
        System.out.println("for addition enter + ");
        System.out.println("for subtraction enter - ");
        System.out.println("for multiplication enter * ");
        System.out.println("for division enter / ");
        System.out.println("for obtaining remainder enter % ");
   

   
        char operator = sc.next().charAt(0); 

        switch(operator){
            case'+' : System.out.println(a + b);
            break;
            case'-' : System.out.println(a - b);
            break;
            case'*' : System.out.println(a * b);
            break;
            case'/' : System.out.println(a / b);
            break;
            case'%' : System.out.println(a % b);
            break;
            default: System.out.println("Wrong operator entered!!");
        }
    }
}
