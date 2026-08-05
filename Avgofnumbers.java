//taking three numbers as input and print their average 
import java.util.*;

public class Avgofnumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers to calculate average: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        double avg = ((x + y + z )/ 3);
        System.out.println("the average of the numbers entered is:" + avg);
    
    }
}
