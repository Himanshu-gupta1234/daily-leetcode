package arrays;
class Solution {
    public int Max_Consecutive_Ones_485 (int[] nums) {
        int max = 0;
        int counter = 0;
       
        for(int num : nums){
            if(num == 1){
                counter++;
                max = Math.max(max , counter);
            }
            else{
                counter = 0 ;
            }
        }
       return max; 
    }
}