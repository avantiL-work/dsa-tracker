//create a bill for user and add 18% gst to it 
import java.util.*;

public class bill{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price of a pencil,pen and eraser respectively: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int bill = a + b + c;
        float gst = ((bill) * 0.18f);

        float totalcost = bill + gst;
        System.out.println("the total cost is : " + totalcost);

    }
}