import java.util.*;

public class SubArray {
  public static void printAllSubArray(int[] a) {
    for (int i = 0; i < a.length; i++) {
      for (int j = i; j < a.length; j++) {
        for (int k = i; k <= j; k++) {
          System.out.print(a[k] + " ");
        }
        System.out.println();
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter no. of ele: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.print("Enter array ele: ");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    printAllSubArray(a);
    sc.close();
  }

}
