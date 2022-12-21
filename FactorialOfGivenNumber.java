import java.util.*;
public class FactorialOfGivenNumber {
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=s.nextInt();
        if(num==0 || num==1)
        {
            System.out.println("The Factorial of Number "+num+"! is"+1);
        }
        else{
            int fact=1;
            for(int i=1;i<=num;i++)
            {
                fact=i*fact;
            }
             System.out.println("The Factorial of Number "+num+"! is "+fact);
        }
        }
}
