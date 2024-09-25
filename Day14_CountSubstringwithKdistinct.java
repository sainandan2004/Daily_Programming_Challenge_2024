import java.util.HashSet;
import java.util.Scanner;

class Day14_CountSubstringwithKdistinct {
    public static String uniqueCheck(String word, int k) {
        HashSet<Character> setWord = new HashSet<>();
        for (char c : word.toCharArray()) {
            setWord.add(c);
        }
        String newWord = "";
        for (char c : setWord) {
            newWord += c;
        }
        if (newWord.length() == k) {
            return word;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Enter a word: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println("Enter the value for distinct strings: ");
        int k = scan.nextInt();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String ru = uniqueCheck(s.substring(i, j + 1), k);
                if (ru != null) {
                    cnt++;
                }
            }
        }
        System.out.println("The word: " + s + " has " + cnt + " unique substrings with " + k + " distinct characters");
        scan.close();
    }
}
