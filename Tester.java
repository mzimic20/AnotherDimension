public class Tester {

  public static void main(String[]args) {
    int[] a = {
      1, 2, 3, 4, 5
    };
    int[] b = {
      2, 4, 6, 8, 10
    };
    System.out.println( ArrayOps.sum(a) );
    System.out.println( ArrayOps.sum(b) );
    System.out.println( ArrayOps.largest(a) );
    System.out.println( ArrayOps.largest(b) );
  }

}
