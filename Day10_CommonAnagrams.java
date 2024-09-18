import java.util.*;

public class Day10_CommonAnagrams {
    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String s : strs) {
            char[] sortedChars = s.toCharArray();
            Arrays.sort(sortedChars);
            String sortedS = new String(sortedChars);
            anagrams.putIfAbsent(sortedS, new ArrayList<>());
            anagrams.get(sortedS).add(s);
        }

        List<List<String>> result = new ArrayList<>(anagrams.values());
        System.out.println(result);
    }
}