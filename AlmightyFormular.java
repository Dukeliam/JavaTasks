import java.util.Scanner;

public class AlmightyFormular{
      public static void main(String[] args){


            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter a number: ");
            int a = input.nextInt(); 
            
            System.out.print("Enter a number: ");
            int b = input.nextInt();
            
            System.out.print("Enter a number: ");
            int c = input.nextInt();
            
             double square = Math.pow(b,2) - (4 * a * c);

            //double squareRoot = Math.sqrt(square);
            System.out.println(square);       
      }
}
