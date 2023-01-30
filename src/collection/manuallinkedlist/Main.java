package collection.manuallinkedlist;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        //list.inserLastElement(1);
        //list.inserLastElement(2);
        //sorted list
        list.insertFirstElement(4);
        list.insertFirstElement(4);
        list.insertFirstElement(3);
        list.insertFirstElement(3);
        list.insertFirstElement(5);
        list.insertFirstElement(5);
        list.display();
        System.out.println();
        list.removeDuplicates();
        list.display();
        /*list.deleteFirstElement();
        list.display();
        System.out.println();
        list.deleteLastElement();
        list.display();*/
    }
}
