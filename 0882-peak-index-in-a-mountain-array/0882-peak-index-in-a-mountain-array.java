class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int r = arr.length - 1;
        int l = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            
            // Check if mid is at the boundaries
            if (mid > 0 && mid < arr.length - 1) {
                if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                    return mid;
                } else if (arr[mid - 1] > arr[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else if (mid == 0) {
                // If mid is at the start, move right
                l = mid + 1;
            } else {
                // If mid is at the end, move left
                r = mid - 1;
            }
        }
        return 0;  
    }
}
