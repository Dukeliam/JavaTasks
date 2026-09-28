public class PrimeNumber{
    public static void main(String[] args){

            int counter = 0;
        for(int index = 1; index <= 100; index++){
                if (index != 1){
                boolean isPrime = true;
            for(int count = 2; count < index; count++){
                  if (index % count == 0){
                    isPrime = false;
            }
        }
                if(isPrime){
                  counter++;   
             System.out.println(index);
                 }
            }
        }
                  System.out.println("The prime number are " + counter);
    }
}
