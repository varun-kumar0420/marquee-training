public class MissingArr {
  public static int[] missingNumber(int[] nums, int n) {
    int[] temp = new int[n + 1];
    for (int i = 0; i < nums.length; i++) {
      temp[nums[i]] = 1;
    }
    int count = 0;
    for (int i = 0; i <= n; i++) {
      if (temp[i] == 0) {
        count++;
      }
    }
    int[] res = new int[count];
    int index = 0;
    for (int i = 0; i <= n; i++) {
      if (temp[i] == 0) {
        res[index++] = i;
      }
    }
    return res;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 5, 7, 9 };
    int n = 9;
    int[] ans = missingNumber(nums, n);
    for (int a : ans) {
      System.out.print(a + " ");
    }
  }
}
