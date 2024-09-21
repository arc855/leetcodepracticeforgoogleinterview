public class Main {
    public static void main(String[] args) {
        int[] nums = new int[] {2,7,11,15};
        int target = 9;
        Solution sol = new Solution();
        sol.twoSum(nums,target);
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] indices  = new int[2];
        int len =  nums.length;
        for(int i = 0;i< len;i++){
            for(int j = i+1; j<len;j++){
                if(nums[i]+nums[j] == target){
                    indices [0] = i;
                    indices [1] = j;
                }
            }
        }
        return indices ;
    }
}
