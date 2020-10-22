import java.util.Arrays;

public class Tester {

  public static void main(String[]args) {
    int[] a = {
      1, 3, 5
    };
    int[][] A = {
      { 1, 0, 12, -1 },
      { 7, -2, 2, 1 },
      { -5, -2, 2, -9 }
    };
    System.out.println( ArrayOps.sum(a) );
    System.out.println( ArrayOps.largest(a) );
    System.out.println( Arrays.toString( ArrayOps.sumRows(A) ) );
    System.out.println( Arrays.toString( ArrayOps.largestInRows(A) ) );
    System.out.println( ArrayOps.sum(A) );
    System.out.println( Arrays.toString( ArrayOps.sumCols(A) ) );
    System.out.println( ArrayOps.isRowMagic(A) );
  }

}
