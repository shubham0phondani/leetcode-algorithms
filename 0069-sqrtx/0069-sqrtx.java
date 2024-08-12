class Solution {
    public int mySqrt(int x) {
        int i = 0;
        int l = x;
        while(i<=l)
        {
            int mid = i + (l-i)/2;
            if (mid*mid == x )
            {
                return mid;
            }
            else if((long)mid*mid > (long)x)
            {
                l = mid - 1;
            }
            else {
                i = mid + 1;
            }
        }
          return l;
    }
}