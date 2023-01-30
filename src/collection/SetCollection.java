package collection;

import java.util.*;

public class SetCollection {

    public static void main(String[] args) {

        Set hashSet = new HashSet();
        Collections.synchronizedSet(hashSet);//By default Hashset is not synchronised

        Set linkedhashset = new LinkedHashSet();
        Collections.synchronizedSet(linkedhashset);

        SortedSet sortedset = new TreeSet();
    }
}
