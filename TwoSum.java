import java.util.Arrays;

class TwoSum {
    public int[] twoSum(int[] nums , int target){
        int[] dummy = Arrays.copyOf(nums , nums.length);
        Arrays.sort(dummy);
        int[] result = new int[2];
        int left = 0;
        int right = dummy.length-1;
        while(left < right){
            int sum = dummy[left] + dummy[right];

            if (sum < target){
                left ++;
            }else if (sum > target){
                right --;
            }else{
                break;
            }
        }
        for (int i=0 ; i<dummy.length ; i++){
            if (nums[i] == dummy[left]){
                result[0] = i;
            }
        }
        for (int i=0 ; i<dummy.length ; i++){
            if (nums[i] == dummy[right]){
                result[1] = i;
            }
        }
        return result;
    }
}
