import java.util.*;
class Day13_LongestSubstring{
    private static boolean CheckPalindrome(String word){
        String org_word = word;
        StringBuilder s = new StringBuilder(word);
        s.reverse();
        String new_s = s.toString();
        if (org_word.equals(new_s)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = scan.nextLine();
        int k = 0;
        String largestSubstring = "";
        while (k < s.length()){
            String word = "";
            for(int i = k; i < s.length(); i++){
                word += s.charAt(i);
                if (CheckPalindrome(word) && word.length() > largestSubstring.length()) {
                    largestSubstring = word;
                }
            }
            k++;
        }
        System.out.print("Largest Substring: "+largestSubstring);
        scan.close();
    }
}