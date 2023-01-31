package collection.set;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(); //Removed duplicated and no order in insertion
        set.add("Santosh");
        set.add("Rinku");
        set.add("Ajay");
        set.add(("Vijay"));
        set.add(("Rinku"));
        System.out.println("Hashset Result="+set);

        Set<String> linkedHashset = new LinkedHashSet<>(); //Removed duplicated and has order how they get inserted
        linkedHashset.add("Santosh");
        linkedHashset.add("Rinku");
        linkedHashset.add("Ajay");
        linkedHashset.add(("Vijay"));
        System.out.println("LinedHashset Result="+linkedHashset);

       // NavigableSet<Object> treeSet = new TreeSet<>().descendingSet();
        SortedSet<String> treeSet = new TreeSet<>();//Removed duplicated entries and inserted in sorted manner(ascending)
        treeSet.add("Santosh");
        treeSet.add("Rinku");
        treeSet.add("Ajay");
        treeSet.add(("Vijay"));
        treeSet.add(("Rinku"));
        System.out.println("Treeset Result="+treeSet);

    }
}
