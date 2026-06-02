public class ValidPalindrome {

  public static char toLower(char ch) {
    if (ch >= 'A' && ch <= 'Z') {
      return (char) (ch - 'A' + 'a');
    }
    return ch;
  }

  public static boolean isAlphaNum(char ch) {
    if ((ch >= '0' && ch <= '9') || (toLower(ch) >= 'a' && toLower(ch) <= 'z')) {
      return true;
    }
    return false;
  }

  public static boolean isPalindrome(String s) {
    int start = 0;
    int end = s.length() - 1;
    while (start < end) {
      if (!isAlphaNum(s.charAt(start))) {
        start++;
        continue;
      }
      if (!isAlphaNum(s.charAt(end))) {
        end--;
        continue;
      }
      if (toLower(s.charAt(start)) != toLower(s.charAt(end))) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }

  public static void main(String[] args) {
    String s = "A man, a Plan, a canal: Panamaa";
    System.out.println(isPalindrome(s));
  }
}
