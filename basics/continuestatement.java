//use of continue statement 
//display all numbers entered by user except multiples of 10

import java.util.*;
public class continuestatement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter your number");
            int n = sc.nextInt();

            if(n % 10 == 0){
                System.out.println("oops you eneterd a multiple of 10 which will be skipped ");
                continue;
            }
            System.out.println("number was : " + n);
        }while (true);
    }
}
