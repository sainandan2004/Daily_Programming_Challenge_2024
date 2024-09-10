import java.util.*;

public class Day2_Missing_Number {
    public static int missingNum(int[] arr, int n) {
        int sum = 0;
        for (int each : arr) {
            sum += each;
        }
        int actualSum = ((n + 1) * (n + 2)) / 2;
        return actualSum - sum;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter values space seperated : ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Missing Number: " + missingNum(arr, n));
    }

}
// sample output
// Enter n:5
// Enter values space seperated : 1 2 3 5 6
// Missing Number: 4
