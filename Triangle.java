import java.util.Scanner;

public class Triangle{
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

            System.out.print("Enter a length: ");
            double length = input.nextDouble();

                double area = (Math.sqrt(3) / 4) * Math.pow(length, 2);
                double volume = area * length;

                  System.out.printf("The area is %f%n",  area);  
                  System.out.printf("The volume is %f%n",  volume); 
    }
}
