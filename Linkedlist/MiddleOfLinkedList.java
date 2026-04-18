import java.util.*;
public class MiddleOfLinkedList extends Linkedlist {
    public int middle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public static void main(String[] args) {
        MiddleOfLinkedList list = new MiddleOfLinkedList();
        list.add_last(1);
        list.add_last(2);
        list.add_last(3);
        list.add_last(4);
        list.add_last(5);

        System.out.println(list.middle());


        List<Integer> arr = new LinkedList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
    }
}
