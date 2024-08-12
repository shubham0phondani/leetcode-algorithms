class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int r =  letters.length ;
        int l = 0;
        while(r >= l)
        {
            int mid  = l + (r-l)/2;
            if (letters[mid]>target)
            {
                 r = mid - 1;
            }
            else
            {
                l = mid + 1;
            }
            if(l==letters.length)
            {
                return letters[0];
            }
        }
        return letters[l];
    }
}