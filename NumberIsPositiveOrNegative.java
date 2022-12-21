import java.util.*;
public class NumberIsPositiveOrNegative {
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num=s.nextInt();
        if(num>0)
        {
            System.out.println("Positive Number");
        }
        else if(num<0)
        {
            System.out.println("Negative Number");
        }
        else
        {
            System.out.println("Neither Positive nor Negative");
        }
    }
}
