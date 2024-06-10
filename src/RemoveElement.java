public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int result = 0;
        int i =0, j = 0;
        for (;;) {
            if (i == nums.length) break;
            if (nums[i]!=val) {
                nums[j] = nums[i];
                j++;
                result++;
            }
            i++;
        }
        return result;
    }
}
