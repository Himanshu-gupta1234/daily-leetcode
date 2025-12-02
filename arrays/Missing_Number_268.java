package arrays;
import java.util.Arrays;
class Missing_Number_268 {
    public int missingNumber(int[] nums) {
        int x = 0;
        Arrays.sort(nums);
        if(nums.length == 1 ){
            if(nums[0] == 1){
                return 0;
            }
            else{
                return 1;
            }
        }
        // if(nums.length == 2){
        //          if(nums[0] == 1){
        //         return 0;
        // }
        // }
        for(int i =0 ; i<nums.length-1 ; i++){
            if((nums[i]+1) != (nums[i+1])){
                    x = nums[i]+1;
                    return x;
            }
            else if(nums[0] != 0){
                return 0;
            }
        }
            return nums.length;
        
    }
}