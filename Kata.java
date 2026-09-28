import java.util.Scanner;
public class Kata{
      public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter a number: ");
            int numberOne = input.nextInt();
            
            System.out.print("Enter a number: ");
            int numberTwo = input.nextInt();
                    
            System.out.println(sub( numberOne, numberTwo));

      }
      public static int max(int numberOne, int numberTwo){
            if (numberOne > numberTwo){
                  return numberOne;
            }
            else{
                  return numberTwo;
            }
      }

      public static boolean isEven(int numberOne){
            if (numberOne % 2 == 0){
                  return true;
            }
            else{
                  return false;
            }
      }

      public static boolean isPrime(int number){
            
            boolean isNumber = true;
            for(int index = 2; index < number; index++){
                if(number % index == 0){
                isNumber = false;
                break;
                  }
             }   
            if (isNumber){
                  return true;
            }
            else{
                  return false;
                  }
            }
      public static int sub(int numberOne, int numberTwo){
            if (numberTwo > numberOne){
                  return numberTwo - numberOne;
            }
            else{
                  return numberOne - numberTwo;
            }
      }
      public static float divide(float numberOne, float numberTwo){
            if (numberTwo == 0){
                  return 0;
            }
            else{
                  return numberOne / numberTwo;
            }
      }
      public static int factor(int numberOne){
           int count = 0;
           for(int index = 1; index <= numberOne; index++){
                  if (numberOne % index == 0){
                  count++;
                  }
           }
                  return count;
      }
      public static boolean isPerfetSquare(int numberOne){
            if(Math.sqrt(numberOne) % 1 == 0){
                  return true;
            }
            else{
                  return false;
            }
      }
      public static boolean isPalindrome(int numberOne){

             int original = numberOne;
             int reverse = 0;
             while(numberOne != 0){    
                int digit = numberOne % 10;
                reverse = reverse * 10 + digit;
                numberOne = numberOne / 10;
        }

                if(original == reverse){
                    return true;
             }

                else {
                     return false;
            }
      }
      public static long factorialNumber(long numberOne){
            long factorial = 1;

    for(long index = 1; index <= numberOne; index++){
            factorial = factorial * index;
            

              }
            return factorial;
      }
      public static long square(long numberOne){
            long result = numberOne * numberOne;
            return result;
      }
}
