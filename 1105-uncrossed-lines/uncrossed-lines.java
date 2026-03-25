class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        
        // dp[i][j] represents the max lines using nums1[0...i-1] and nums2[0...j-1]
        int[][] dp = new int[m + 1][n + 1];
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    // If numbers match, we can draw a line and add it to the previous best
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    // If they don't match, take the best result by skipping one element from either array
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
        return dp[m][n];
    }
}