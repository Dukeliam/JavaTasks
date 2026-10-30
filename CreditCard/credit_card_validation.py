
def is_valid(card_number):
      if(card_number <= 0) :
            return False;
      

      int count = 0;

          while (card_number > 0) :
              count++;
              card_number /= 10;
          

                if(count < 13 or count > 16) :
                    return False;
                 
                else :
                    return True;
    


def is_card_valid(card_number):
      if(card_number <= 0) :
            return False;
      

      total = 0;
      position = 0;
      
      while(card_number > 0):
            digit = (int) (card_number % 10);
            
            if(position % 2 == 1):
                  digit *= 2;
                  
                  if(digit > 9):
                        digit -= 9;
                  
            
            
            total += digit;
            
            card_number /= 10;            
            position++;
      

            if(total % 10 == 0):
                  return True;
            
            else:
                  return False;
                        


def get_card_type(card_number):
      if(card_number <= 0) :
            return -1;
      
      
      long type = card_number;
      
      while(type >= 100):
            type /= 10;
      
      
      if(type / 10 == 3 && type % 10 == 7):
            return 3;
      
      
      while(type >= 10):
            type /= 10;
      
      
      if(type == 4):
            return 1;
      
      elif(type == 5):
            return 2;
      
      elif(type == 6):
            return 3;
      
      elif:
            return 0;
     

