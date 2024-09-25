import java.util.HashSet;
import java.util.*;
class Day15_LongestSubstring_norepeating {
    private static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        int res = lengthOfLongestSubstring(word);
        System.out.println(res);
        sc.close();
    }
}
