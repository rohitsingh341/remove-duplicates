public class Main {

    // nums = [1,1,2];

    public static void main(String[] args) {
        //int nums[] = {1,1,2};
        int nums[] = {1,1,2,3,3,3,4,5,6,6,6,7};
        int uniqueValues = removeDuplicates(nums);
        System.out.println("Unique values is sorted array -> " + uniqueValues);
    }

    public static int removeDuplicates(int[] nums) {
        int leftPointer = 1;
        int rightPointer = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                rightPointer++;
            }
            else {
                nums[rightPointer-1] = nums[rightPointer];
                leftPointer++;
            }
        }
        return leftPointer;
    }
}