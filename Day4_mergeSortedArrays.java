import java.util.*;

class Day4_mergeSortedArrays {
    public static void merge(int[] arr1, int[] arr2, int m, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        // using arr1 2n size
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                i--;
            } else {
                arr1[k] = arr2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            arr1[k] = arr2[j];
            j--;
            k--;
        }

        for (int x = 0; x < n; x++) {
            arr2[x] = arr1[m + x];
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter m: ");
        int m = input.nextInt();
        int n = m;
        int[] arr1 = new int[m + n];
        System.out.print("Enter elements of arr1 (space-separated): ");
        for (int i = 0; i < m; i++) {
            arr1[i] = input.nextInt();
        }

        int[] arr2 = new int[n];
        System.out.print("Enter elements of arr2 (space-separated): ");
        for (int i = 0; i < n; i++) {
            arr2[i] = input.nextInt();
        }

        merge(arr1, arr2, m, n);

        System.out.println("After merging:");
        System.out.print("arr1: ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        System.out.print("arr2: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}
// Sample Output:
// Enter m: 5
// Enter elements of arr1 (space-separated): 1 2 6 8 9
// Enter elements of arr2 (space-separated): 3 4 5 10 15
// After merging:
// arr1: 1 2 3 4 5
// arr2: 6 8 9 10 15