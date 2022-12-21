import java.util.*;
public class NumberofdigitsInAnInteger {
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=s.nextInt();
        int num1=num;
        int count=0;
        while(num>0)
        {
            num=num/10;
            count++;
        }
        System.out.println("The Number Digits in "+num1+" is "+count);
    }
}
