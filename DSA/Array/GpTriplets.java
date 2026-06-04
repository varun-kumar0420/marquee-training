public class GpTriplets {
  public static void geometrictriplet(int[] arr) {
    int n = arr.length;
    for (int j = 1; j < n; j++) {
      int i = j - 1;
      while (i >= 0) {
        int k = j + 1;
        while (k < n) {
          if (arr[j] * arr[j] == arr[i] * arr[k]) {
            System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
          }
          k++;
        }
        i--;
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 6, 10, 18, 54 };
    geometrictriplet(arr);
  }
}
