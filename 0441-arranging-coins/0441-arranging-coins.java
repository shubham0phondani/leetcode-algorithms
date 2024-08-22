class Solution {
    public int arrangeCoins(int n) {
        int k = 0;
        int i = 1;
        while(i<=n)
        {
            n -= i;
            i++;
            k++;
        }
        return k;
    }
}