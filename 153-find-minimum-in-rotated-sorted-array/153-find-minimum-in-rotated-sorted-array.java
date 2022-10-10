class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start)/2;
        boolean leftSorted = nums[start] < nums[mid];
        boolean rightSorted = nums[mid] < nums[end];
        if(leftSorted & rightSorted || nums.length == 1){
            return nums[0];
        }
        while(start <= end){
            mid = start + (end - start)/2;
            leftSorted = nums[start] <= nums[mid];
            rightSorted = nums[mid] < nums[end];
            if(leftSorted & rightSorted){
                return nums[start];
            }
            if(mid != 0 && nums[mid] < nums[mid - 1]){
                return nums[mid];
            }
            else if(leftSorted){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}