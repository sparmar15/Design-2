class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int i = -1;
        int j = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target && mid == 0){
                i = mid;
                break;
            }
            if(nums[mid] == target && nums[mid - 1] != target){
                i = mid;
                break;
            }
            if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        start = 0;
        end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target && mid == nums.length - 1){
                j = mid;
                break;
            }
            if(nums[mid] == target && nums[mid + 1] != target){
                j = mid;
                break;
            }
            if(nums[mid] <= target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return new int[]{i, j};
    }
}