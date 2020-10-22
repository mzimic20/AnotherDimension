public class ArrayOps {

  public static int sum(int[] arr) {
    int sum = 0;
    for(int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  public static int largest(int[] arr) {
    int ans = 0;
    for(int i = 0; i < arr.length; i++) {
      if (arr[i] >= ans) ans = arr[i];
    }
    return ans;
  }

//  public static int[] sumRows(int[][] matrix) {

//  }

//  public static int[] largestInRows(int[][] matrix) {

//  }

//  public static int sum(int[][] arr) {

//  }

}
