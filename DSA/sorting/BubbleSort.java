import java.util.*;

public class BubbleSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int swapCount = 0;
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < n - 1; i++) {
      boolean flag = false;
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          flag = true;
          swapCount++;
          System.out.print("Step " + swapCount + ": ");
          for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
          }
          System.out.println();
        }
      }
      if (!flag) {
        break;
      }
    }
    System.out.println("Swap Count: " + swapCount);
    System.out.println("Sorted Array: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }

    sc.close();
  }
}
