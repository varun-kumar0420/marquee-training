import java.util.*;

public class Countarr {
  public static void sumArray(int[] arr) {
    int sum = 0;
    for (int i : arr) {
      sum += i;
    }
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sum - arr[i];
    }
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sumArray(arr);
  }
}
