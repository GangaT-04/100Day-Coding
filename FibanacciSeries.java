import java.util.*;
public class FibanacciSeries {
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=s.nextInt();
        int n1=0;
        int n2=1,n3;
        System.out.print(n1+" "+n2);
        for(int i=2;i<n;i++)
        {
           n3=n1+n2;
           System.out.print(" "+n3+" ");  
           n1=n2;
           n2=n3;
        }
        
    }
}