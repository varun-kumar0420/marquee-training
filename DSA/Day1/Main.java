class Main {
  public static long decimalToBinary(int n) {
    long binary = 0;
    int place = 1;
    while (n > 0) {
      int rem = n % 2;
      binary = binary + rem * place;
      place = place * 10;
      n = n / 2;
    }
    return binary;
  }

  public static void main(String[] args) {
    int n = 120;
    long binary = decimalToBinary(n);
    System.out.println("Decimal: " + n);
    System.out.println("Binary: " + binary);
  }
}