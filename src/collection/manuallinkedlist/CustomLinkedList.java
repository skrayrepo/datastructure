package collection.manuallinkedlist;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void insertFirstElement(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size+=1;
    }

    public void deleteFirstElement(){
        //int val = head.value;
        if(head == null){
            tail = null;
        }
        head = head.next;
        size-=1;
        //return val;
    }

    public void deleteLastElement(){
        if (head == tail) {
            deleteFirstElement();
            return;
        }
        Node secondLast = get(size - 2);
        tail = secondLast;
        tail.next = null;
        size-=1;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node  = node.next;
        }
        return node;
    }

    public void inserLastElement(int value){
        Node node = new Node(value);
        if(tail == null){
            insertFirstElement(value);
            return;
        }
        tail.next = node;
        tail = node;
        size+=1;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value +"->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void removeDuplicates(){
        Node node = head;
        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
        }
        tail = node;
        node.next = null;
    }

}
