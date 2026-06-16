class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int i = 0;
        int[] newArray = new int[nums.length];

        for(int n : nums){
            newArray[i] = sum += n;
            i++;
        }

        return newArray;
    }
}
