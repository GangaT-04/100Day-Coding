import java.util.*;
public class CheckTheNumberisEvenOrOdd {
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num=s.nextInt();
        if(num%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
