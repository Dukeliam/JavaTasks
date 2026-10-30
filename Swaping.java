import java.util.Scanner;

public class Swapping{
      public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      int temp = 0;
      int numberThree = 0;
      System.out.print("Enter a number: ");
      int numberOne = input.nextInt();
      
      System.out.print("Enter a number: ");
      int numberTwo = input.nextInt();
      
//      temp = numberOne;
//      numberOne = numberTwo;
//      numberTwo = temp;
      
      
      numberTwo = numberOne * numberTwo;
      numberOne = numberOne / numberTwo;
      numberTwo = numberOne / numberOne;
      System.out.println("First number: " + numberOne);
      System.out.println("Second number: " + numberTwo);
      }
}
