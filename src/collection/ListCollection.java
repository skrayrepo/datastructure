package collection;

import java.util.*;

public class ListCollection {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(20);
        linkedlist.add(30);
        linkedlist.add(10);
        //linkedlist.stream().sorted().forEach(System.out::print);
        System.out.println(Arrays.toString(linkedlist.toArray()));
        List<Integer> vector = new Vector<>();
        Vector<Integer> stack = new Stack<>();
        Iterator it = linkedlist.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (int i = 0; i < linkedlist.size(); i++) {
            System.out.println(linkedlist.get(i));

        }

        list = Collections.checkedList(list,Integer.class);
        list.add(3);
        list.add(null);
        System.out.println(list);
        System.out.println(list.size());
    }
}
