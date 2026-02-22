class Solution {
    public int binaryGap(int n) {
        int lastIndex = -1;
        int maxDistance = 0;
        int index = 0;
        
        while (n > 0) {
            if ((n & 1) == 1) {   // check last bit
                if (lastIndex != -1) {
                    maxDistance = Math.max(maxDistance, index - lastIndex);
                }
                lastIndex = index;
            }
            n = n >> 1;  // right shift
            index++;
        }
        
        return maxDistance;
    }
}