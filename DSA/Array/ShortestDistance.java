import java.util.*;

public class ShortestDistance {
  public static int min(int a, int b) {
    return (a > b ? a : b);
  }

  public static int shortestDistance(int[] arr, int n) {
    int res = -1;
    for (int i = 0; i < n; i++) {
      if (arr[i] % 2 == 0) {
        for (int j = i + 1; j < n; j++) {
          if (arr[j] % 2 == 0) {
          }
          if (res == -1)
            res = j - i;
          res = min(res, j - i);
          break;
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
    for (int i = 0; i < n; i++) {
      System.out.print("Enter the element " + i + " index ");
      arr[i] = sc.nextInt();
      System.out.println();
    }
    System.out.println("Minimum distance = " + shortestDistance(arr, n));
  }
}
