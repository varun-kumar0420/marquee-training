import java.util.*;

public class Linear {
  public static boolean isFound(int arr[], int target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return true;

      }
    }
    return false;
  }

  public static int FoundAt(int arr[], int target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target)
        return i;
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      System.out.println(isFound(arr, i));
      System.out.println(FoundAt(arr, i));
    }
  }
}
