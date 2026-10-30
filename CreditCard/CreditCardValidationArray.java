public class CreditCardValidation{
      public static boolean isValid(char[] cardNumber){
            if(cardNumber.length < 13 || cardNumber.length > 16){
                  return false;
            }
            else{
                  return true;
            }
      }

      public static int cardDigit(char[] cardNumber){
            int sum = 0;
            for(int index = cardNumber.length - 2; index >= 0; index-= 2){
                  int digit = cardNumber[index] -'0';
                  int doubleDigit = digit * 2;
                  if(doubleDigit > 9){
                        doubleDigit = doubleDigit - 9;
                  }
                  sum += doubleDigit;
            }
                  return sum;
      
      }
      public static int sumOfOddPlace(char[] cardNumber){
            int sumTwo = 0;
            for(int index = cardNumber.length - 1; index >= 0; index-= 2){
                  int digit = cardNumber[index] -'0';
                  sumTwo += digit;
            }
            return sumTwo;
      }

      public static boolean isCardValid(char[] cardNumber){
            int sum = 0;
            for(int index = cardNumber.length - 2; index >= 0; index-= 2){
                  int digit = cardNumber[index] -'0';
                  int doubleDigit = digit * 2;
                  if(doubleDigit > 9){
                        doubleDigit = doubleDigit - 9;
                  }
                  sum += doubleDigit;            
            }

            int sumTwo = 0;
            for(int count = cardNumber.length - 1; count >= 0; count-= 2){
                  int figure = cardNumber[count] -'0';
                  sumTwo += figure;
            }

                  int total = sum + sumTwo;
                  
                  if(total % 10 == 0){
                        return true;
                  }
                  else{
                        return false;
                  }
      }
}
