import java.util.*;

class Matrixmul {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    int A[][] = new int[row][col];
    int B[][] = new int[row][col];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        A[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        B[i][j] = sc.nextInt();
      }
    }
    int arr[][] = new int[row][col];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        for (int k = 0; k < col; k++) {
          arr[i][j] += A[i][k] * B[k][j];
        }
      }
    }
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}