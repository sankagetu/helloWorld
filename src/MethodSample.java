public class MethodSample {
      public static void main(String[] args) {
        isPalindrome("あいいあ");
    }

    public static void isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        if (s.equals(reversed)) {
            System.out.println("「" + s + "」は回文です！");
        } else {
            System.out.println("「" + s + "」は回文ではないです。");
        }
    }
}
