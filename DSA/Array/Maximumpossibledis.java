import java.util.*;

public class Maximumpossibledis {

  public static int max(int a, int b) {
    return (a > b ? a : b);
  }

  public static int maximumPossible(int[] arr, int n) {
    int res = 0;
    for (int i = 0; i < n; i++) {
      int search = arr[i];
      for (int j = i + 1; j < n; j++) {
        if (arr[j] == search) {
          res = max(j - i, res);
        }
      }
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.print("Enter the element: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Maximum element = " + maximumPossible(arr, n));
  }
}
