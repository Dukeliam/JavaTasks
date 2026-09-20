public class PowerTable{
    public static void main(String[] agrs){

        System.out.println("Number\tSquare\tCube");
        for(int index = 0; index <= 10; index++){

            int square = (int)Math.pow(index, 2);
            int cube = (int)Math.pow(index, 3);

                System.out.println(index + "\t" + square + "\t" + cube);
        }
    }
}
