import java.util.Scanner;
public class MaximumNumberOfHandshakes
{
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
System.out.print("Enter the number of people in the room: ");
int num = s.nextInt();
int t = num * (num-1) / 2;
System.out.println("Total number of handshakes = "+t);
}
}
