class Solution {
    public int arrangeCoins(int n) {
        int i = 1;
        int k = 0;
        while(n>0)
        {
            i++;
            n -= i;
            k++;
        }
        return k;
    }
}