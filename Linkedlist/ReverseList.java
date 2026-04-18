import java.util.LinkedList;
public class ReverseList {
    static void reverse(LinkedList<Integer> list){
        int left = 0;
        int right = list.size() - 1;

        while(left < right){
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    static void display(LinkedList<Integer> list){
        for(int num : list){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        display(list);
        reverse(list);
        display(list);
    }
}
