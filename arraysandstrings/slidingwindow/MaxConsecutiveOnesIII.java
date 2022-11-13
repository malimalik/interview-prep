package arraysandstrings.slidingwindow;

public int longestOnes(int[] nums, int k) {
        
    //What are my constraints? 
    //My constraints are that: 
    //We can never have more than two zeros
    //We will keep moving our window until we don't have more than two zeroes
    //I have to calculate the maximum number of consecutive ones
    //I have to find a window of just ones, I will keep expanding my window if I keep encountering a 1. 
    int left = 0;
    int zeroes = 0;
    int ans = 0;
    for(int right = 0; right<nums.length; right++) {
        //We keep count of our zeroes
        if(nums[right] == 0) zeroes++;
        
    //If my left pointer has crossed my right pointer and the number of zeroes are greater than k                   itself, I need to bring my left pointer ahead and drop the number of zeroes
        while(left<=right && zeroes>k) {
            if(nums[left] == 0) zeroes--;
            left++;
        }
        
        ans = Math.max(ans, right-left+1);
    }
    
        return ans;

    
}
