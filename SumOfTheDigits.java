import java.util.*;
public class SumOfTheDigits {
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=s.nextInt();
        int sum=0,n;
        while(num>0)
        {
            n=num%10;
            sum=sum+n;
            num=num/10;
        }
        System.out.println(sum);
    }
}
