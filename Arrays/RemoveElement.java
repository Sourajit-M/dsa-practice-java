public class RemoveElement {
    public static void main(String[] args) {
        int nums[] = {3,2,2,3};
        int val = 3;
        System.err.println(removeElement(nums, val));
    }  
    public static int removeElement(int[] nums, int val) {
        int x=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[x] = nums[i];
                x++;
            }
        }

        return x;
    }
}
