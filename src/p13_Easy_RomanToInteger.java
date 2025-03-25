public class p13_Easy_RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int result = 0;
        int previous = -1;

        for (int i = s.length() - 1; i >= 0; i--) {
            int number = getIntValue(s.charAt(i));

            if (i != s.length() - 1 && number < previous) {
                number = -number;
            }

            result += number;
            previous = Math.abs(number);

        }

        return result;
    }

    public static int getIntValue(char roman) {
        return switch (roman) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
