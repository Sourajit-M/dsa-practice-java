// xor of same number is 0 and xor of 0 with any number is that number itself. 
// x^x = 0, x^0 = x
public class SingleNumber {
    public static void main(String[] args) {
        int nums[] = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int nums[]){
        int xor = 0;
        for(int num : nums){
            xor ^= num;
        }

        return xor;
    }
}
