import java.util.*;
public class FindStrongNumberOrNot {
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n=s.nextInt();
        int fact=1,sum=0,rem;
        int copy=n;
        if(n==0)
        {
            sum=sum+fact;
        }
        else
        {
        while(n>0)
        {
            fact=1;
            rem=n%10;
            for(int i=1;i<=rem;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
        }
        }
        if(copy==sum)
        {
            System.out.print("Strong Number");
        }
        else
        {
            System.out.println("Not a Strong Number");
        }
    }
}
