//using break statement 
//keep entering numbers till the user enters a multiple of 10
import java.util.*;
public class abc{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

       
        do{
            System.out.println("enter your number");
            int n = sc.nextInt();
            if(n % 10 == 0){
                System.out.println("oops you enetered a multiple of 10!");
                break;
            }
            System.out.println(n);
        }while(true);
    }
}