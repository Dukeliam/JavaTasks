public class Sorting{
      public static void main(String[] args){
            
            int number[] = {5,7,2,4,6};
            
            sortingArray(number[]);
            
            for(int index = 0; index < number.length; index++){
                  System.out.println(number[index] + " ");
            }

      }
      public static void sortingArray(int number[]){
            for(int index = 0; index < number.length; index++){
                  for(int count = 0; count < number.length; count++){
                  
                        if(number[count] > number[count + 1]){
                              
                              int swap = number[count];
                              number[count] = number[count + 1];
                              number[count + 1] = swap;
                        }
                  }
            } 
      }
}
