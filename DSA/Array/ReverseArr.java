import java.util.*;

public class ReverseArr {
  public static void reverseArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[n - i - 1];
      arr[n - i - 1] = temp;
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    reverseArray(arr);
    for (int a : arr) {
      System.out.print(a + " ");
    }
    sc.close();
  }
}
