public class p14_Easy_LongestCommonPrefix {
    public static void main(String[] args) {

        String[] strs = new String[]{"reflower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {

        int shortestLength = Integer.MAX_VALUE;
        int shortestStringIndex = -1;

        for (int i = 0; i < strs.length; i++) {
            if (shortestLength > strs[i].length()) {
                shortestLength = strs[i].length();
                shortestStringIndex = i;
            }
        }

        if (shortestLength == 0) return "";

        String limitString = strs[shortestStringIndex];

        StringBuilder current = new StringBuilder();

        for (int i = 0; i < limitString.length(); i++) {
            current.append(limitString.charAt(i));

            for (String str : strs) {
                if (!str.substring(0,i+1).contentEquals(current)) {
                    return current.substring(0,i);
                }
            }
        }

        return current.toString();
    }
}
