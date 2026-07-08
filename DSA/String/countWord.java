class countWord {
  public static void main(String[] args) {
    int count = 0;
    String s = "Cat dog meow";
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if ((ch >= 65 && ch <= 90) || ch >= 97 && ch <= 122) {
        count++;
      }
    }
    System.out.println(count);
  }
}