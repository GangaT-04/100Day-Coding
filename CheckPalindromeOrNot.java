import java.util.*;
public class CheckPalindromeOrNot {
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=s.nextInt();
        int c=n;
        int sum=0;
        while(n>0)
        {
            int r=n%10;
            sum=sum*10+r;
            n=n/10;
            
        }
        if(c==sum)
        {
            System.out.println(c+ " is a palindrome");
        }
        else
        {
            System.out.println(c+" is not a palindrome");

        }
    }
}
