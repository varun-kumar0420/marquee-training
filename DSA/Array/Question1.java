// QUESTION: - write a code to pick 4 consecutive no or subarray whose sum is 4. 
// brute force first.

public class Question1 {
  int sum = 0;

  public static int consecutiveNo(int k, int[] arr) {
    int l = 0;
    int r = 0;
    while (l < r - 1) {
      sum = sum - arr[l];

      l++;
      r++;
      sum = sum + arr[l];
      int maxSum = Math.max(maxSum, sum);
    }
    return maxSum;
  }

  public static void main(Stirng[] args) {
    int[] arr=[-1,2,3,4,5,-1];
    int k=4;
    consecutiveNo(k, arr);
  }
}