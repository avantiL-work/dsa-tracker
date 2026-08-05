import java.util.*;

public class Inputproductoftwonumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers : ");
        int x = sc.nextInt();
        int y = sc.nextInt();

         int product = ( x * y );

        System.out.println("the product of the two numbers entered is : " + product);
    }
}