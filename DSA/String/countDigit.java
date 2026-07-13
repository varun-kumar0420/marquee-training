public class countDigit {
  public static void main(String[] args) {
    // int count = 0;
    // String s = "12abc3def4";
    //
    // for (int i = 0; i < s.length(); i++) {
    // char ch = s.charAt(i);
    // if (ch >= '0' && ch <= '9') {
    // count++;
    // System.out.println(ch);
    // }
    // }

    String s = "167hgsuhf810hhd14";

    for (int i = 0; i < s.length(); i++) {
      if (Character.isDigit(s.charAt(i))) {
        int num = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
          num = num * 10 + (s.charAt(i) - '0');
          i++;
        }

        System.out.println(num);
        i--;
      }
    }

  }
}
