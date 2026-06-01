// import java.util.*;
// 
// public class Arraysub {
//   static int[] callDiff(int[] a, int[] b, int n, int m) {
//     int num1 = 0;
//     int place1 = 1;
//     for (int i = a.length - 1; i >= 0; i--) {
//       num1 += a[i] * place1;
//       place1 *= 10;
//     }
//     int num2 = 0;
//     int place2 = 1;
//     for (int i = b.length - 1; i >= 0; i--) {
//       num2 += b[i] * place2;
//       place2 *= 10;
//     }
//     int res = num1 - num2;
// 
//     int res2 = res;
//     int count = 0;
//     while (res > 0) {
//       count++;
//       res /= 10;
//     }
//     int finalres[] = new int[count];
//     for (int i = count - 1; i >= 0; i--) {
//       finalres[i] = res2 % 10;
//       res2 /= 10;
//     }
//     return finalres;
//   }
// 
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n1 = sc.nextInt();
//     int[] arr1 = new int[n1];
//     for (int i = 0; i < n1; i++) {
//       arr1[i] = sc.nextInt();
//     }
//     int n2 = sc.nextInt();
//     int[] arr2 = new int[n2];
//     for (int i = 0; i < n2; i++) {
//       arr2[i] = sc.nextInt();
//     }
//     callDiff(arr1, arr2, n1, n2);
//   }
// }

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