/*
 * Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.

 

Example 1:

Input: nums = [10,5,2,6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.

Example 2:

Input: nums = [1,2,3], k = 0
Output: 0

 

Constraints:

    1 <= nums.length <= 3 * 104
    1 <= nums[i] <= 1000
    0 <= k <= 106


 */
public int numSubarrayProductLessThanK(int[] nums, int k) {
        
    //Here, I need to ask myself, how many sub-arrays end at the index that I am currently at. 
    
    int left = 0;
    int ans = 0; 
    int product = 1;
    
    for(int right = 0; right<nums.length; right++) {
        product = product * nums[right];
        
        //Now, we need to ask ourselves, when is our constraint broken? 
        //Our constraint is broken if: 
        //1. Our current product exceeds k &&
        //2. Our left is either equal to or less than our right
        //We know that our right is fixed, so we want to make sure that our left does not exceed right 
        
        while(left<=right && product>=k) {
            product = product/nums[left];
            left++;
        }
        
        ans += right-left+1;
    }
    
    return ans;
    
}