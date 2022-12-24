import java.util.*;
public class FindTheFactorsOfNumber {
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n=s.nextInt();
        int sum=0,rem;
        int copy=n;
        System.out.print("The factors are:");
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(" "+i);
            }
        }
        
    }
}
