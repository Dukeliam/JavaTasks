import java.util.Scanner;

public class Road{
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

            System.out.print("Enter a meter: ");
            int meter = input.nextInt();

                double feet = meter * 3.2785;

                    System.out.printf("%d meter is %f feet", meter, feet);
    }
}
