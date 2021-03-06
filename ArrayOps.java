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

  public static int[] sumRows(int[][] matrix) {
    int[] ans = new int[ matrix.length ];
    for(int i = 0; i < ans.length; i++) {
      ans[i] = sum( matrix[i] );
    }
    return ans;
  }

  public static int[] largestInRows(int[][] matrix) {
    int[] ans = new int[ matrix.length ];
    for(int i = 0; i < ans.length; i++) {
      ans[i] = largest( matrix[i] );
    }
    return ans;
  }

  public static int sum(int[][] arr) {
    return ( sum( sumRows( arr ) ) );
  }

  public static int[] sumCols(int[][] matrix) {
    int[] ans = new int[ matrix[0].length ];
    for(int i = 0; i < matrix.length; i++) {
      for(int j = 0; j < ans.length; j++) {
        ans[j] += matrix[i][j];
      }
    }
    return ans;
  }

  public static boolean isRowMagic(int[][] matrix) {
    int[] temp = sumRows(matrix);
    boolean same = true;
    int prev = temp[0];
    for(int i = 1; i < temp.length && same; i++) {
      if (prev != temp[i]) same = false;
    }
    return same;
  }

  public static boolean isColMagic(int[][] matrix) {
    int[] temp = sumCols(matrix);
    boolean same = true;
    int prev = temp[0];
    for(int i = 1; i < temp.length && same; i++) {
      if (prev != temp[i]) same = false;
    }
    return same;
  }

  public static boolean isLocationMagic(int[][] matrix, int row, int col) {
    int[] rows = sumRows(matrix);
    int[] cols = sumCols(matrix);
    if (rows[row] == cols[col]) return true;
    else return false;
  }

}
