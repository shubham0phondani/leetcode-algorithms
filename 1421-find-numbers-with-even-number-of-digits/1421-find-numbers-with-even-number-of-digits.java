class Solution {
    public int findNumbers(int[] nums) {
        int a = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {   
            int k = nums[i];
            int l = 0 ;
            int temp = 0;
            while(k>0)
            {
            temp = k / 10;
            k = temp;
            l++;
            }
            if (l%2 == 0)
            {
                 a++;
            }
        }
        return a;
    }
}