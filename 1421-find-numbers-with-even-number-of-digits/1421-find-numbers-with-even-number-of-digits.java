import java.util.*;
class Solution {
    public int findNumbers(int[] nums) {
        int a = 0 ;
      for(int i = 0 ; i < nums.length ; i++)
      {
        String str = Integer.toString(nums[i]);
        if(str.length()%2 == 0)
        {
            a++;
        }
      }
      return a;
    }
}