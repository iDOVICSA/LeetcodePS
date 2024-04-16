public class RemoveDuplicatesFromSortedArray {


    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[k] = nums[i];
            k++;
            while ((i + 1 < nums.length) && (nums[i] == nums[i + 1])) {
                i++;
            }
        }
        return k;
    }
}
