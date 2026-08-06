//to print sum of first n natural numbers while loop
import java.util.*;
public class whileloop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int sum = 0;
        System.out.println("enter the number till where you want sum to be calculated");
        int n;
        n = sc.nextInt();

        while(i<=n){
            sum = sum + i;
            i++;
            
        }

        System.out.println(sum);
    }
}