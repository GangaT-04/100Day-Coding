import java.util.*;
public class CheckGivenNumberIsPerfectOrNot {
     public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n=s.nextInt();
        int sum=0,rem;
        int copy=n;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(copy==sum)
        {
            System.out.print("Perfect Number");
        }
        else
        {
            System.out.println("Not a Perfect  Number");
        }
    }
}
