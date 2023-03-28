package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("San",20);
        hashMap.put("Wan",50);
        hashMap.put("Lan",80);
        hashMapUpdate(hashMap);

        Map<String,Integer> conHashMap =  new ConcurrentHashMap<>();
        conHashMap.put("San",20);
        conHashMap.put("Wan",50);
        conHashMap.put("Lan",80);
        conCurrentHashMapUpdate(conHashMap);

    }

    private static void hashMapUpdate(Map<String,Integer> hashMap){
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()){
            String key = (String)it.next();
            if(key.equals("San")){
                //Below code throw ConcurrentModificationException
                //hashMap.put("Tap",90);
                it.remove();
                //Below code throw ConcurrentModificationException
                //hashMap.remove(key);
            }
        }
        System.out.println(hashMap);
    }

    private static void conCurrentHashMapUpdate(Map<String,Integer> hashMap){
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()){
            String key = (String)it.next();
            if(key.equals("San")){
                hashMap.put("Tap",90);
                it.remove();
                //Below code throw ConcurrentModificationException
                //hashMap.remove(key);
            }
        }
        System.out.println(hashMap);
    }
}
