package LeetCodeStringprblms;
public class MergeAltString {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int l1 = word1.length();
        int l2 = word2.length();
        int maxLen = Math.max(l1, l2);

        for (int i = 0; i < maxLen; i++) {
            if (i < l1)
                result.append(word1.charAt(i));
            if (i < l2)
                result.append(word2.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2)); // Output: apbqcrs
    }
}

