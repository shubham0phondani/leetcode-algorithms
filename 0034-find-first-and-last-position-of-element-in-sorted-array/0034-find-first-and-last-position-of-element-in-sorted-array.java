class Solution {
    public int[] searchRange(int[] nums, int target) {
         int first = findFirst(nums, target);
         int last = findLast(nums,target);
         return new int[]{first, last};
    }
    public static int findFirst(int[] nums, int target)
    {
        int r = nums.length-1;
        int l = 0;
        int first = -1;
        while(r>=l)
        {
            int mid = l + (r - l)/2;
            if(nums[mid]==target)
            {
                first = mid;
                r = mid - 1;
            }else if (nums[mid] > target)
            {
                r = mid - 1;
            }else
            {
                l = mid + 1;
            }
        }
        return first;
    }
        public static int findLast(int[] nums, int target)
    {
        int r = nums.length-1;
        int l = 0;
        int last = -1;
        while(r>=l)
        {
            int mid = l + (r - l)/2;
            if(nums[mid]==target)
            {
                last = mid;
                l = mid + 1;
            }else if (nums[mid] > target)
            {
                r = mid - 1;
            }else
            {
                l = mid + 1;
            }
        }
        return last;
    }
}