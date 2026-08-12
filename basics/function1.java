//write a program to calculate the sum of two numbers and print done after it and use functions
//without return and without argument 

import java.util.*;

public class function1{
    
    //Declaration of done function
    public static void done(){
        System.out.println("Done!, we successfully calculated the sum.");
    }

    //Declaration of sum function 
    public static void calculatesum(){
        System.out.println("Enter two numbers");
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       int sum = a + b;
       System.out.println("the sum of the two numbers entered is : " + sum);
    }

    //Calling
    public static void main(String args[]){
       calculatesum();
       done();
    }

    


    



}