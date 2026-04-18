package Sorting;
// works on all leetcode questions if it says [1, n] or [0, n-1] range
import java.util.*;

public class CyclicSort {
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void cyclic_sort(int arr[]){
        int i=0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }

    //https://leetcode.com/problems/missing-number/description/
    public static int missingNumber(int[] arr) {
        //cyclic sort approach

        int i=0;
        while(i < arr.length){
            if(arr[i]!=arr.length && arr[i] != arr[arr[i]]){
                int correct = arr[i];

                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }
        }

        for(i=0 ;i<arr.length; i++){
            if(arr[i] != i) return i;
        }

        return arr.length;
    }

    //https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
    public static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();

        int i=0; 
        int n = nums.length;
        while(i < n){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        for(i=0; i<n; i++){
            if(nums[i] != i+1) ans.add(i+1);
        }

        return ans;       
    }

    //https://leetcode.com/problems/find-the-duplicate-number/description/
    public static int findDuplicate(int[] nums) {
        int i=0;
        while(i < nums.length){
            int correct = nums[i] -1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

        for(i=0; i<nums.length; i++){
            if(nums[i] == nums[i+1]) return nums[i];
        }
        return -1;
    }

    //https://leetcode.com/problems/set-mismatch/description/
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

        for(i=0; i<nums.length; i++){
            if(nums[i] != i+1) return new int[]{nums[i], i+1};
        }
        return new int[0];
    }

    //https://leetcode.com/problems/first-missing-positive/description/
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i]<=nums.length && nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

        for(i=0; i<nums.length; i++){
            if(nums[i] != i+1) return i+1;
        }   
        return nums.length + 1;
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 1, 4};
        cyclic_sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
