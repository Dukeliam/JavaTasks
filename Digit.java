import java.util.Scanner;

public class Digit{
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

            System.out.print("Enter number: ");
            int number = input.nextInt();

                int numberOne = (number / 10000) % 10;
                int numberTwo = (number / 1000) % 10;
                int numberThree = (number / 100) % 10;
                int numberFour = (number / 10) % 10;
                int numberFive = number % 10;

            System.out.printf("%d  %d  %d  %d  %d " + numberOne, numberTwo, numberThree, numberFour, numberFive);
    }
}
