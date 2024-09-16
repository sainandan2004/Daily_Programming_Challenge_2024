import java.util.*;

public class Day8_ReverseString {

    // Function to reverse the words in a string
    public static String reverseWords(String st) {
        String[] set_arr = st.trim().split("\\s+");
        StringBuilder s = new StringBuilder();
        for (int i = set_arr.length - 1; i >= 0; i--) {
            s.append(set_arr[i]);
            if (i > 0) {
                s.append(" ");
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        String st = "a good  example";
        String result = reverseWords(st);
        System.out.println(result);
    }
}