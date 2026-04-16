//Gauss Sum Formula - n(n+1)/2
public class MissingNumber {
    public static void main(String[] args) {
        int nums[] = {3, 0, 1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int nums[]){
        int n = nums.length;
        int expected_sum = n * (n+1) / 2;
        int actual_sum = 0;
        for(int num : nums){
            actual_sum += num;
        }

        return expected_sum - actual_sum;
    }
}
