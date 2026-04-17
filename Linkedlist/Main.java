public class Main{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        
        static class LinkedList{
            Node head;
            Node tail;
            int size;

            public void add(int data){
                Node newNode = new Node(data);
                if(size == 0){
                    head = tail = newNode;
                }else{
                    tail.next = newNode;
                    tail = newNode;
                }
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
        

            public void remove_first(){
                if(size == 1 || head == tail){
                    head = tail = null;
                }else{
                    head = head.next;
                }
                size--;
            }

            public void get_first(){
                System.out.println(head.data);
            }

            public void get_last(){
                System.out.println(tail.data);
            }

            public void get_at(int index){
                Node temp = head;
                while(temp != null && index > 0){
                    temp = temp.next;
                    index--;
                }

                System.out.println(temp.data);
            }
            
            public void remove_last(){
                if(size == 1 || head == tail){
                    head = tail = null;
                }else{
                    Node temp = head;
                    while(temp.next != tail) temp = temp.next;

                    temp.next = null;
                    tail = temp;
                }
            }

            public void remove_at(int index){
                if(index == 0){
                    remove_first();
                }else{
                    Node temp = head;
                    while(temp != null){
                        if(index - 1 == 0){
                            temp.next = temp.next.next;
                            break;
                        }
                        temp = temp.next;
                        index--;
                    }
                }
            }

    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.display();
        System.out.println(list.size);
        list.get_at(1);
        list.remove_at(1);
        list.display();
    }
}