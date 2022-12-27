import java.util.*;
public class ArmstrongNumber {
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=s.nextInt();
        int copy = n;
 int result=0;
 int count=0;
 int rem;
 while (n != 0)
 {
 n /= 10;
 count++;
 }
 n = copy;
 while (n != 0)
 {
 rem = n%10;
 int mul=1;
 for(int i=1;i<=count;i++) {
 mul=mul*rem;
 }
 result=result+mul;
 n/= 10;
 }
 if(result==copy)
 System.out.println("Armstrong Number");
 else
 System.out.println("Not Armstrong number");

    }
}
