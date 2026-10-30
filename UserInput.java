public class ReverseArray {
    public static void main(String[] args) {
      int[][] numbers = {
                          {1, 2, 3}, 
                          {4, 5, 6}, 
                          {7, 8, 9}
                       };
              int[][] result = reversedArray(numbers);
              for (int index = 0; index < numbers.length; index++) {
                  for (int count = 0; count < numbers[index].length; count++) {
                      System.out.print(result[index][count]);
            }
      }
}
    public static int[][] reversedArray(int[][] numbers) {
      for (int index = 0; index < numbers.length; index++) {
          for (int row = 0; row < numbers[index].length; row++) {
              for (int column = row + 1; column < numbers[index].length; column++) {
                      int arraySwap = numbers[index][row];
                          numbers[index][row] = numbers[index][column];
                          numbers[index][column] = arraySwap;
                              } 
                        }
                  }
            return numbers;
      }
}
