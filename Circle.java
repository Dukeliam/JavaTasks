import java.util.Scanner;

public class Circle{
   public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

 System.out.println("Enter radius");
 int radius = input.nextInt();

 int diameter = 2 * radius;
 double circumference = 2 * 3.14159 * radius;
 double area = 3.14159 * radius * radius;

 System.out.printf("Diameter = %d%n ", diameter);
 System.out.printf("Circumference = %f%n ", circumference);
 System.out.printf("Area = %f%n ", area);
    }
}
