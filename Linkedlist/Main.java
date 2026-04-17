public class Main {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.add_last(1);
        list.add_last(2);
        list.add_last(3);
        list.display();
        System.out.println(list.size);
        list.get_at(1);
        list.remove_at(1);
        list.display();
    }
}
