class Solution {
    public boolean isPerfectSquare(int num) {
        long r = num;
        long l = 0;
        while(r>=l)
        {
            long mid = l + (r - l)/2;
            if(mid*mid == num)
            {
                return true;
            }
            else if (mid*mid > num)
            {
                r = mid - 1;
            }
            else
            {
                l = mid + 1;
            }
        } 
        return false;
    }
}