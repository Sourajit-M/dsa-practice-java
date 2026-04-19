public class ReverseList extends Linkedlist {

    static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }


    static void display(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        Linkedlist list = new Linkedlist();
        list.add_last(1);
        list.add_last(2);
        list.add_last(3);
        list.add_last(4);
        list.add_last(5);

        System.out.println("Original List:");
        display(list.head);

        list.head = reverse(list.head);

        System.out.println("Reversed List:");
        display(list.head);
    }
}
