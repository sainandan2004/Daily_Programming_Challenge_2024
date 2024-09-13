import java.util.*;

public class Day5_ArrayLeaders {
    public static int leaderBoard(List<Integer> nums) {
        if (nums.size() == 1) {
            return nums.get(0);
        }
        int fir = nums.get(0);
        int x = nums.indexOf(fir) + 1;
        if (fir < max(nums.subList(x, nums.size()))) {
            fir = max(nums.subList(x, nums.size()));
        }
        return fir;
    }

    public static int max(List<Integer> nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        List<Integer> nums = new ArrayList<>();
        for (int num : arr) {
            nums.add(num);
        }
        ArrayList<Integer> a = new ArrayList<>();
        while (nums.size() > 0) {
            int res = leaderBoard(nums);
            a.add(res);
            nums = nums.subList(nums.indexOf(res) + 1, nums.size());
        }
        System.out.print("Array Leaders: " + a);
        scan.close();
    }
}
