package collection.stack.customstack;

import java.util.HashMap;

public class HashMapTest {
        public static void main(String... args){
            HashMap<TestClass, String> a = new HashMap();

            a.put(new TestClass("a"), "a");
            a.put(new TestClass("b"), "b");

            System.out.println(a.get(("a")) +
                    " " + a.get(("b")));
        }
}
