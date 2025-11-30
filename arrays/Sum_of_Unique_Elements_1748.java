class Sum_of_Unique_Elements_1748 {
    public int sumOfUnique(int[] nums) {
        int sum =0 ;
        for(int i=0 ; i< nums.length ; i++){
           int  counter = 0;
            for(int j =0 ; j < nums.length ; j++){
                if(nums[j] == nums[i]){
                    counter++;
                }
            }
            if(counter == 1){
                sum = sum + nums[i];
            }
        }
        return sum;
    }
}