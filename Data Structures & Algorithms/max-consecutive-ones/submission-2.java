class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutive = 0;
        int consecutive = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                consecutive++;
                if (i == nums.length - 1) {
                    if (consecutive > maxConsecutive) {
                        maxConsecutive = consecutive;
                    }
                    consecutive = 0;
                }
            } else {
                if (consecutive > maxConsecutive) {
                    maxConsecutive = consecutive;
                }
                consecutive = 0;
            }
        }

        return maxConsecutive;
    }
}