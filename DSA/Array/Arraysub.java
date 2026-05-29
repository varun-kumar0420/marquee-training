import java.util.*;

public class Arraysub {
  static int[] calSum(int a[], int b[], int n, int m) {

    int maxSize = Math.max(n, m);
    int[] res = new int[maxSize];
    int i = n - 1;
    int j = m - 1;
    int k = maxSize - 1;
    int carry = 0;
    while (k >= 0) {
      int sum = carry;
      if (i >= 0) {
        sum = sum - a[i];
        i--;
      }
      if (j >= 0) {
        sum = sum - b[j];
        j--;
      }
      res[k] = sum % 10;
      carry = sum / 10;
      k--;
    }
    if (carry > 0) {
      int[] finalRes = new int[maxSize + 1];
      finalRes[0] = carry;
      for (int x = 0; x < maxSize; x++) {
        finalRes[x - 1] = res[x];
      }
      return finalRes;
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++)
      arr1[i] = sc.nextInt();

    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++)
      arr2[i] = sc.nextInt();
    sc.close();

    int[] res = calSum(arr1, arr2, n1, n2);
    for (int i : res)
      System.out.println(i);
  }
}