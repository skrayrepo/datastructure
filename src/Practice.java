import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] str1 = str.split(" ");
        String result= "";
        for (int i = str1.length -1; i > -1; i--) {
            result = result+" "+str1[i];
        }
        System.out.println(result);
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        System.out.println(Arrays.toString(list.toArray()));
        list.stream().distinct().forEach(System.out::println);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i+1) == list.get(i)){
                //list.remove(i);
            }
        }
        System.out.println(Arrays.toString(list.toArray()));
    }
}
