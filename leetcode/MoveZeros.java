
class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[j] == 0) {
                j++;
                }else{
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j++;
            }
            
        }
    }

    public void main(String[] args) {
        int[] nums = {0,1,0,3,12};
      
      moveZeroes(nums);
    }
}
