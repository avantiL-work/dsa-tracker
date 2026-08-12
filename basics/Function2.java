//without return with arguements 
import java.util.*;

public class Function2{
    //parametres 
    public static void calculatesum(int x, int y){
        int sum = x + y;
        System.out.println("the sum of the entered two numbers is:");
        System.out.println(sum);
    }

    public static void main(String args[]){
        System.out.println("Enter two numbers : ");
        //taking input in main so that values can be passed down to parameters
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //passing values of parameters
        calculatesum(a,b);

    }
    
    
}