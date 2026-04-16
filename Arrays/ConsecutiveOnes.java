
public class ConsecutiveOnes {
    public static void main(String[] args) {
        int nums[] = {1, 1, 0, 1, 1, 1};
        System.out.println(maxConsecutiveOnes(nums));
    }
    public static int maxConsecutiveOnes(int nums[]){
        int count = 0;
        int max_count = Integer.MIN_VALUE;

        for(int num : nums){
            if(num == 1){
                count++;
            }else{
                max_count = Math.max(max_count, count);
                count = 0;
            }
        }

        return Math.max(max_count, count);
    }
}
