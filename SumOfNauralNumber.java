import java.util.Scanner;
public class SumOfNauralNumber {
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=s.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
    
}
