class Solution {
    public int findNumbers(int[] nums) {
        int j = 0 ;
        for(int i = 0 ; i<nums.length ; i++)
        {  
            int k = nums[i];
            int n = 0;
            while(k>0)
            {
                k /=  10;
                n++;
            }
            if(n%2 == 0)
            {
                j++;
            }
        }

        return j;
    }
}