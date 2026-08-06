//to print square pattern using for loop
/* pattern to print is 
   {* * * * 
   * * * * 
   * * * * 
   * * * *}
   */ 
import java.util.*;
public class forloop1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lenght of the pattern to be printed ");
        int n;
        n = sc.nextInt();


        for(int line = 1; line<= n ; line ++){
            System.out.print(" * * * * ");
            //this skips a line everytime the loop runs 
             System.out.println();
        }

    }
}