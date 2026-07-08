
// LEETCODE 1886 rotate the matrix 90 degree.
import java.util.*;

public class Leetcode1886 {
  // rotate matrix clock wise
  public void Rotate(int[][] mat) {

    int n = mat.length;
    // transpose the matrix.
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
      }
    }
    // reverse each row.
    for (int k = 0; k < n; k++) {
      int left = 0;
      int right = n - 1;
      while (left < right) {
        int temp = mat[k][left];
        mat[k][left] = mat[k][right];
        mat[k][right] = temp;
        left++;
        right--;
      }
    }
  }

  // compare two matrices.
  public boolean findRotation(int[][] mat, int[][] target) {
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat.length; j++) {
        if (mat[i][j] != target[i][j]) {
          return false;
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] mat = new int[n][n];
    int target[][] = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        mat[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        target[i][j] = sc.nextInt();
      
      }
    }
  findRotation(int[][] mat, int[][] target);
    sc.close();
  }
}