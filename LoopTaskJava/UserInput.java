import java.util.Scanner;

public class SumUserInput{
      public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            
      for(int index = 1; index <= number; index++){
            System.out.println(index);
            }
      }
}
