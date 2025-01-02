public class JumpGame {

    public static boolean canJump(int[] nums) {
        boolean result = false;
        if ((nums.length == 1) && (nums[0] == 0)) return true;
        int currentMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] + i >= currentMax) && (i <= currentMax)) {
                currentMax = nums[i] + i;
                if (currentMax >= nums.length - 1) return true;
            }
        }
        return result;
    }
}
