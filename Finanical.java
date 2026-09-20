import java.util.Scanner;

public class Finanical{
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

            System.out.print("Enter a subtotal: ");
            int subtotal = input.nextInt();

            System.out.print("Enter a gratuity rate: ");
            int gratuityRate = input.nextInt();

                double rate = subtotal * gratuityRate;
                 double total = subtotal + gratuityRate;
                    char dollar = '$';
                    System.out.printf("The gratuity is %f and total is %c%f%n", rate, dollar, total);
    }
}
