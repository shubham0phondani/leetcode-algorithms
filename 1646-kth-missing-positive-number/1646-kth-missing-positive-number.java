class Solution {
    public int findKthPositive(int[] arr, int k) {
        int r = arr.length-1;
        int l = 0;
        while(r>=l)
        {
          int mid = l + (r-l)/2;
          int kitne_missing_till_mid = arr[mid] - (mid + 1);
          if(kitne_missing_till_mid < k)
          {
             l= mid + 1;
          }  
          else
          {
            r = mid - 1;
          }
        }
        return l + k ;
    }
}
