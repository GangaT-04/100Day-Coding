import java.io.*;
import java.util.*;
public class ASCIIValuesOfCharacter {
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the character:");
        char l=s.next().charAt(0);
        
        int ascii=l;
        System.out.println("The ASCII value of"+l+"is:"+ascii);
        
    }
}
