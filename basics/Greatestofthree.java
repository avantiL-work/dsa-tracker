//code to print the largest of three numbers 
import java.util.*;

public class Greatestofthree{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("A is the greatest :"+ a);
        }

        else if(b>a && b>c){
            System.out.println("B is the greatest: " + b);
        }

        else{
            System.out.println("C is the greatest: " + c);
        }
    }
}