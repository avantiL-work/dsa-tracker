//income tax calculator 
/* if income < 5L then 0% tax 
    income between 5 - 10L then 20% tax 
    income > 10L then 30% tax    */ 

import java.util.*;
public class incometax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the annual income : ");
        int income = sc.nextInt();
        float tax;

        if(income <= 500000){
            System.out.println(" 0 % tax will be applied ");
        }

        else if(income >= 500000 && income <= 1000000){
            tax = (income * 0.20f);
            System.out.println("Tax applied will be 20% : " + tax);
        }

        else{
            tax = ( income * 0.30f);
            System.out.println("Tax applied will be 30% : " + tax);

        }
    }
}