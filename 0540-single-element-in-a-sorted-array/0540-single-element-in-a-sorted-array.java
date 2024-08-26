class Solution {
    public int singleNonDuplicate(int[] nums) {
        int r = nums.length - 1;
        int l =0;
        while(r > l)
        {
            int mid = l + (r - l)/2;
            if(mid%2 == 1)
            {
                mid--;
            }
            if(nums[mid]  == nums[mid+1])
            {
                l = mid + 2;
            }
            else
            {
                r = mid;
            }
        }
        return nums[l];
    }
}