import java.util.Scanner;

public class UserInput{
      public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            int sum = 1;
            
      for(int index = 1; index <= number; index++){
            sum += index;
            System.out.println(sum);
            }
      }
}
