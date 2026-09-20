import java.util.Scanner;

public class TaskThree{
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.next();

           char firstCharacter = word.charAt(0);
           char lastCharacter = word.charAt(word.length() -1);

                if(firstCharacter == lastCharacter){
                        System.out.println("It is Palindrome");
        }
                else{
                     System.out.println("It is not Palindrome");   
        }
    }
}
