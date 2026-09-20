import java.util.Scanner;

public class TaskFive{
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Character: ");
        char character = input.next().charAt(0);

                 if (Character.isDigit(character)){
                        System.out.println("it is a Digit");
        }
                else if (Character.isLetter(character)){
                     System.out.println("it is a letter");   
        }
                else {
                    System.out.println("it is a symbol");
        }
    }
}
