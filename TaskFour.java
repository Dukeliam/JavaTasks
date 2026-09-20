import java.util.Scanner;

public class TaskFour{
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String name = input.next();

                if(name.length() <= 3){
                        System.out.println("Hello " + name);
        }
                else{
                     System.out.println("Hello " + name);   
        }
    }
}
