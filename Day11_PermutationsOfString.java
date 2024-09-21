public class Day11_PermutationsOfString {
    static void GetPermutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char xe = str.charAt(i);
            String res = str.substring(0, i) + str.substring(i + 1);
            GetPermutation(res, ans + xe);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        GetPermutation(s, "");
    }
}
