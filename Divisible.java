import java.util.Scanner;

public class Divisible{
    public static void main(String[] agrs){
    
    Scanner williams = new Scanner(System.in);

   System.out.println("Enter number: ");
   int number = williams.nextInt();

   if(number % 3 == 0){
        System.out.println("This number is divisible by 3");
        }

   if (number % 3 != 0){
        System.out.println("This number is not divisible by 3");
        }
    }
}
