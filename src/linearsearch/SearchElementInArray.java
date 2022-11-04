package linearsearch;

import java.util.Arrays;

public class SearchElementInArray {
    public static void main(String[] args) {
        String name = "Santosh";
        System.out.println(Arrays.toString(name.toCharArray()));
        char target = 'd';
        boolean exist = searchChar2(name,target);
        if(exist)
            System.out.println("Charecter present in the String");
        else
            System.out.println("Charecter doesn't present in the String");
    }

    public static boolean searchChar(String name, char target){
        for(int i=0;i < name.length(); i++){
            if(target == name.charAt(i)){
                return  true;
            }
        }
        return false;
    }

    public static boolean searchChar2(String name, char target){
        for(char ch:name.toCharArray()){
            if(ch == target){
                return  true;
            }
        }
        return false;
    }
}
