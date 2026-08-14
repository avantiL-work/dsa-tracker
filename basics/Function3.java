//with return with argument
import java.util.*;

public class Function3{

    public static int sumcalculator(int x , int y){ //formal parameters
        int sum = x + y;
        return sum;
    }


public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    //out of scope method
    int sum = sumcalculator(a,b); //arguments or actual parameters
    System.out.println("the sum is:" + sum);



}
}