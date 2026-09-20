import java.util.Scanner;

public class TaskOne{
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

            System.out.print("Enter a word: ");
            String word = input.next();

               word.length();

                if(word.length() < 5){
                        System.out.println("Short String");
        }
                else if(word.length() > 5 && word.length() < 10){
                        System.out.println("Medium String");
        }

                else{
                        System.out.println("Long String");
        }

    }
}
