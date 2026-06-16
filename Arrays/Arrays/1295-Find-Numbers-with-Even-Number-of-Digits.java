class Solution {
    public int findNumbers(int[] nums) {
        int rescount = 0;
        for(int element : nums){
            int res = counting(element);
            if(res%2 == 0){
                rescount++;
            }
        }
        return rescount;
    }
    static int counting(int n){
        int count = 0;
        while(n > 0){
            count++;
            n /= 10;
        }
        return count;
    }
}
