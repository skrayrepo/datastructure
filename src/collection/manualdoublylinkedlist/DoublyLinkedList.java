package collection.manualdoublylinkedlist;

public class DoublyLinkedList {

    public Node head;
    public Node tail;

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(head != null){
            head.prev = node;
        }
    }
    public void display(){
        Node temp = head;
        while (temp !=null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }


}
