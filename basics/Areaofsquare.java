//Input side of square and find area 
import java.util.*;

public class Areaofsquare{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side of square : ");
        double a = sc.nextDouble();

        double area = (a * a);
        System.out.println("the area of square is: " + area);
    }
}