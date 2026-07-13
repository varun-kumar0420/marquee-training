import java.util.*;

public class Leetcode151 {
  public String reverseWords(String s) {
    s = s.trim();
    String[] word = s.split("\\s+");
    StringBuilder sb = new StringBuilder();
    for (int i = word.length - 1; i >= 0; i--) {
      sb.append(word[i]);
      if (i != 0) {
        sb.append(" ");
      }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String: ");
    String s = sc.nextLine();
    Leetcode151 ans = new Leetcode151();
    System.out.println(ans.reverseWords(s));

    sc.close();

  }

}