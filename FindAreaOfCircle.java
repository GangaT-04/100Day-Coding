import java.util.Scanner;
public class FindAreaOfCircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int r = s.nextInt();
        double area;
        area =3.14d*r*r;
        System.out.println("The area Of Circle is:"+area);
    }
}
