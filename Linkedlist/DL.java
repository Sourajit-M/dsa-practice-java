public class DL {
    Node head;
    int size;
    private class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void addLast(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        } 

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = node;
        node.prev = temp;
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addFirst(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
        size++;
    }

    public void addAt(int data, int index){
        if(index == 0){
            addFirst(data);
            return;
        }
        Node node = new Node(data);
        Node temp = head;

        while(temp != null && index>0){
            temp = temp.next;
            index--;
        }

        

    }

}
