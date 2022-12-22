import java.util.Scanner;
public class ReverseTheNumber {
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number");
        int n=s.nextInt();
        int rem,rev=0;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.print(rev);
    }
}
