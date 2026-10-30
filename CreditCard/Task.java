import java.util.Scanner;

public class Task{
      public static void main(String[] args){
      
            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            
            if(number > 9 || number < 0){
                  int digit = 0;
                  int sum  = 0;
                  while(number > 0 || number < 0){
                        digit = number % 10;
                        number = number / 10;
                        sum += digit;
                        //System.out.println(sum);
                  }
                        if(sum > 9){
                              int oneDigit = sum - 9;
                              System.out.println(oneDigit);
                        }
                        else if (sum > -9){
                              int sumTwo = 0;
                              while(sum < 0){
                                    digit = sum % 10;
                                    sum += sumTwo;
                                    sum = sum / 10;
                              }
                             System.out.println(sum);
                        }
                        else{
                        System.out.println(sum);
                        }
            }
            else{
                  System.out.println(number);
            }
      }
}
