package collection.manuallinkedlist;

public class Node {
    public int value;
    Node next;

    Node(int value){
        this.value = value;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
