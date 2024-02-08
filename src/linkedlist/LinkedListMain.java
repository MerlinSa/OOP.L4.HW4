package linkedlist;
public class LinkedListMain {
    public static void main(String[] args) {
        Linked<String> list = new MyLinkedList<>();
        list.addLast("apple");
        list.addLast("mango");

        list.addFirst("cherry");
        System.out.println(list.size());
        System.out.println(list.getElementByIndex(2));

    }
}
