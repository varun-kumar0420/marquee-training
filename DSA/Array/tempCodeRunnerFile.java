import java.util.*;

public class Arraysub {
  public static int[] substraction(int[] arr1, int[] arr2) {
    boolean negative = false;
    if (Arrays.compare(arr1, arr2) < 0) {
      int[] temp = arr1;
      arr1 = arr2;
      arr2 = temp;
      negative = true;
    }
    int i = arr1.length - 1;
    int j = arr2.length - 1;
    int max = Math.max(arr1.length, arr2.length);
    int[] res = new int[max];
    int k = max - 1;
    while (i >= 0 || j >= 0) {
      int a = (i >= 0) ? arr1[i] : 0;
      int b = (j >= 0) ? arr2[j] : 0;
      if (a < b) {
        int borrowIndex = i - 1;
        while (borrowIndex >= 0 && arr1[borrowIndex] == 0) {
          arr1[borrowIndex] = 9;
          borrowIndex--;
        }
        if (borrowIndex >= 0) {
          arr1[borrowIndex]--;
        }
        a += 10;
      }
      res[k] = a - b;
      i--;
      j--;
      k--;
    }
    int start = 0;
    while (start < res.length - 1 && res[start] == 0) {
      start++;
    }
    int ans[] = java.util.Arrays.copyOfRange(res, start, res.length);
    if (negative) {
      System.out.print("-");
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr1[] = new int[n];
    int arr2[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr1[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      arr2[i] = sc.nextInt();
    }
    int[] result = substraction(arr1, arr2);
    for (int x : result) {
      System.out.print(x + " ");
    }
  }
}