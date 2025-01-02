public class FindFirstAndLastPositionOfElementInSortedArray {


    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        /* ********** Solution 1 : O(n) complexity
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == target) {
                result[0] = i;
                while((i+1<nums.length) && (nums[i] == nums[i+1])) {
                    i++;
                }
                result[1]=i;
                break;
            }
        }*/
        /********* Solution 2 Binary search : O(log (n)) complexity */
        int leftPtr = 0;
        int rightPtr = nums.length -1;
        int middlePtr =0;

        /** First binary search to find the first index that hold target*/
        while (leftPtr <= rightPtr) {
            middlePtr = (leftPtr + rightPtr) / 2 ;
            if (nums[middlePtr] > target) rightPtr = middlePtr -1;
            else if (nums[middlePtr]< target) leftPtr = middlePtr +1;
            else {
                result[0] = middlePtr;
                // search for left most index (the first index that hold the target value)
                rightPtr = middlePtr -1;
            }
        }

        /** Second binary search to find the first index that hold target*/
        leftPtr = 0;
        rightPtr = nums.length -1;
        middlePtr =0;
        while (leftPtr <= rightPtr) {
            middlePtr = (leftPtr + rightPtr) / 2 ;
            if (nums[middlePtr] > target) rightPtr = middlePtr -1;
            else if (nums[middlePtr]< target) leftPtr = middlePtr +1;
            else {
                result[1] = middlePtr;
                // search for left most index (the first index that hold the target value)
                leftPtr = middlePtr +1;
            }
        }
        return result;
    }
}
