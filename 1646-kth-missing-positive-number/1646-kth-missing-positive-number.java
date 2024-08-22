class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num = 1; 
        int i = 0;

        while (k > 0) {
            if (i < arr.length && arr[i] == num) {
                i++; 
            } else {
                k--;
            }
            num++; 
        }

        return num - 1;
    }
}
