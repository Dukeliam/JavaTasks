import java.util.Scanner;

public class SquareMeter{
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

            System.out.print("Enter a square meter: ");
            int meter = input.nextInt();

                double ping = meter * 0.3025;

                    System.out.printf("%d square meter is %f ping", meter, ping);
    }
}
