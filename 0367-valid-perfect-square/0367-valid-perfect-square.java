class Solution {
    public boolean isPerfectSquare(int num) {
        long r = num;
        long l = 0;
        while(l<=r)
        {
            long mid = l + (r - l)/2;
            if(mid*mid==num)
            {
                return true;
            }
            else if(mid*mid < num)
            {
                l = mid + 1;
            }
            else
            {
                r = mid - 1;
            }
        }
        return false;
    }
}