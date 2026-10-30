public class CreditCardValidation{

      public static boolean isValid(long cardNumber){
            if(cardNumber <= 0) {
                  return false;
            }

            int count = 0;

                while (cardNumber > 0) {
                    count++;
                    cardNumber /= 10;
                }

          if(count < 13 || count > 16) {
              return false;
          } 
          else {
              return true;
          }
      }

      public static boolean isCardValid(long cardNumber){
            if(cardNumber <= 0) {
                  return false;
            }

            int sum = 0;
            int position = 0;
            
            while(cardNumber > 0){
                  int digit = (int) (cardNumber % 10);
                  
                  if(position % 2 == 1){
                        digit *= 2;
                        
                        if(digit > 9){
                              digit -= 9;
                        }
                  }
                  
                  sum += digit;
                  
                  cardNumber /= 10;            
                  position++;
            }

                  if(sum % 10 == 0){
                        return true;
                  }
                  else{
                        return false;
                  }            
      }
      
      public static int getCardType(long cardNumber){
            if(cardNumber <= 0) {
                  return -1;
            }
            
            long type = cardNumber;
            
            while(type >= 100){
                  type /= 10;
            }
            
            if(type / 10 == 3 && type % 10 == 7){
                  return 3;
            }
            
            while(type >= 10){
                  type /= 10;
            }
            
            if(type == 4){
                  return 1;
            }
            else if(type == 5){
                  return 2;
            }
            else if(type == 6){
                  return 3;
            }
            else{
                  return 0;
            }
      }
}
