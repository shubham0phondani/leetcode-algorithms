class Solution {
    public int searchInsert(int[] nums, int target) {
        int right = nums.length-1;
        int left = 0;
        while(left<=right)
        {
            int mid = left + (right - left)/2;
            if(nums[mid] == target)
        {
             return mid;
        }
           if(target < nums[mid])
            {
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
}
