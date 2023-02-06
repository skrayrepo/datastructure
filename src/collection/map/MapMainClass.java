package collection.map;

import java.util.*;
import java.util.stream.Collectors;

public class MapMainClass {

    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(3),"San");
        hashMap.put(Integer.valueOf(5),"All");
        hashMap.put(Integer.valueOf(2),"Dull");
        hashMap.put(Integer.valueOf(1),"Zap");
        //System.out.println(hashMap);
        Set<Map.Entry<Integer, String>> entry = hashMap.entrySet();
        for (Map.Entry<Integer, String> map:hashMap.entrySet()){
           // System.out.print(map.getKey()+"->"+map.getValue()+",");
        }

        hashMap = new LinkedHashMap<>();
        hashMap.put(Integer.valueOf(3),"San");
        hashMap.put(Integer.valueOf(5),"All");
        hashMap.put(Integer.valueOf(2),"Dull");
        hashMap.put(Integer.valueOf(1),"Zap");
        hashMap.entrySet().stream().forEach(System.out::println);
        List<Map.Entry<Integer,String>> list = hashMap.entrySet().stream()
                .filter(e-> e.getValue().startsWith("Sa"))
                .collect(Collectors.toList());
        list.forEach(System.out::println);
        //System.out.println(hashMap);
        TreeMap<String, Integer> groceryItems = new TreeMap<String, Integer>(Comparator.<String>reverseOrder());
        Map<Integer, String> treeMap = new TreeMap<>(Comparator.<Integer>reverseOrder());
        treeMap.put(Integer.valueOf(3),"San");
        treeMap.put(Integer.valueOf(5),"All");
        treeMap.put(Integer.valueOf(2),"Dull");
        treeMap.put(Integer.valueOf(1),"Zap");
        Set<Integer> key = treeMap.keySet();
        System.out.println(key);
    }
}
