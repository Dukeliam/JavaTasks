import java.util.Scanner;

public class Accordingly{
    public static void main(String[] agrs){

    Scanner input = new Scanner(System.in);
   
    System.out.println("Enter First Number: ");
      int number1 = input.nextInt();
     
    System.out.println("Enter Second Number: ");
     int number2 = input.nextInt();

      System.out.println("Enter Third Number: ");
      int number3 = input.nextInt();

      System.out.println("Enter Forth Number ");
      int number4 = input.nextInt();

      System.out.println("Enter Fifth Number: ");
      int number5 = input.nextInt();
     

       int largest = number1;
       int smallest = number1;

    if(number2 > largest)
       largest = number2;
      
    if (number3 > largest)
        largest = number3;

    if (number4 > largest)
        largest = number4;

    if (number5 > largest)
        largest = number5;

    if (number2 < smallest)
        smallest = number2;

    if (number3 < smallest)
        smallest = number3;
   
     if (number4 < smallest)
        smallest = number4;
 
    if (number5 < smallest)
        smallest = number5;

System.out.println("Largest: " + largest);
System.out.println("Smallest: " + smallest);

  }
}
