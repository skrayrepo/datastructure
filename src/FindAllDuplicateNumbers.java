import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindAllDuplicateNumbers {

    public static void main(String[] args) {
        int[] arr = {2,5,2,4,3,2,4,2,5,11};
        List list = findAllDuplicateNumbers(arr);
        System.out.println(Arrays.toString(list.toArray()));
        List list1 = findAllDuplicateNumbers1(arr);
        System.out.println(Arrays.toString(list1.toArray()));
        String[] str = {"San","Tap","Sau","San","Sra","Sau"};
        List<String> listStr = findAllDuplicateNumbers1(str);
        System.out.println(Arrays.toString(listStr.toArray()));
        String str3 = "SUCCESS";
        duplicateCharacters(str3);
        countCharecters(str3);
        int strLen = str3.length() - 1;
        String result="";
         result = recusiveReverse(str3,strLen,result);
        System.out.println(result);
        findDuplicate(arr);
    }

    private static String recusiveReverse(String str3, int strLen, String result) {
        if(strLen < 0){
            return result;
        }
        if(strLen >= 0 ){
            result=result+str3.charAt(strLen);
        }
        return recusiveReverse(str3,strLen-1,result);
    }

    private static void countCharecters(String str3) {
        Map<String,Long> count= Stream.of(str3.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        count.entrySet().stream().filter(e->e.getValue() > 1).forEach(System.out::println);
    }

    private static void duplicateCharacters(String str3) {
        String result = "";
        String duplicate = "";
        for (int i = 0; i < str3.length(); i++) {
            if(result.indexOf(str3.charAt(i)) < 0){
                result = result + str3.charAt(i);
            }else{
                if(duplicate.indexOf(str3.charAt(i)) < 0)
                    duplicate = duplicate+str3.charAt(i);
            }
        }
        System.out.println(duplicate);
    }

    private static List<Integer> findAllDuplicateNumbers(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                if(arr[i] == arr[j] && i != j){
                    //Integer value = arr[i];
                    if(list != null && !list.contains(arr[i])){
                        list.add(arr[i]);
                    }
                    break;
                }
            }
        }
        return list;
    }
    private static List<Integer> findAllDuplicateNumbers1(int[] arr) {
        Set<Integer> hasSet = new HashSet<>();
        List<Integer> duplicateNumber = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!hasSet.add(arr[i])){
                if(duplicateNumber !=null && !duplicateNumber.contains(arr[i]))
                    duplicateNumber.add(arr[i]);
            }
        }
        return duplicateNumber;
    }

    private static List<String> findAllDuplicateNumbers1(String[] arr) {
        Set<String> hasSet = new HashSet<>();
        List<String> duplicateNumber = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!hasSet.add(arr[i])){
                if(duplicateNumber != null && !duplicateNumber.contains(arr[i]))
                    duplicateNumber.add(arr[i]);
            }
        }
        return duplicateNumber;
    }
    private static void findDuplicate(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
           if(!result.contains(arr[i])) {
                result.add(arr[i]);
            }else{
                System.out.println(arr[i]);
            }
        }
    }

}
