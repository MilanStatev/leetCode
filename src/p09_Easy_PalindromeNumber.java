public class p09_Easy_PalindromeNumber {
    public static void main(String[] args) {
        long input = 9987654321L;

        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(int x) {
        String numberToString = String.valueOf(x);
        for (int i = 0; i < numberToString.length() / 2; i++) {
            if (numberToString.charAt(i) != numberToString.charAt(numberToString.length() - 1 - i)) return false;
        }

        return true;
    }

    public static boolean isPalindrome(long x) {
        if (x < 0) return false;

        long original = x;
        long reverse = 0;

        do {
            reverse = reverse * 10 + (x % 10);
            x /= 10;
        } while (x != 0);

        return reverse == original;
    }
}
