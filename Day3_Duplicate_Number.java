import java.util.*;

public class Day3_Duplicate_Number {
    public static int duplicate_number(int[] arr, int n) {
        int sum = 0;
        for (int each : arr) {
            sum += each;
        }
        int tempSum = (n - 1) * (n) / 2;
        return sum - tempSum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter Elements space seperated : ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Duplicate number: " + duplicate_number(arr, n));

    }
}

// sample output
// Enter n: 5
// Enter Elements space seperated : 1 2 3 4 3
// Duplicate number: 3