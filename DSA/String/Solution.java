import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first no.: ");
        String a = sc.nextLine();
        System.out.print("Enter the second no.: ");
        String b = sc.nextLine();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                ans.append('0');
            } else {
                ans.append('1');
            }
        }
        System.out.print("Print result: " + ans);
    }
}