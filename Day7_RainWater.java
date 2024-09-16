class Day7_RainWater {

    static long trappingWater(int arr[], int n) {
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];
        leftmax[0] = arr[0];
        rightmax[n - 1] = arr[n - 1];
        long result = 0;
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], arr[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], arr[i]);
        }
        for (int i = 0; i < n; i++) {
            result += Math.min(leftmax[i], rightmax[i]) - arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 0, 0, 2, 0, 4 };
        int n = arr.length;

        long trappedWater = trappingWater(arr, n);
        System.out.println("Trapped water: " + trappedWater + " units");
    }
}