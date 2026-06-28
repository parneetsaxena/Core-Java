package collections.problems;

import java.util.*;

public class CharacterSorting {
    public static void main(String[] args) {
        List<Character> chars = new ArrayList<>(Arrays.asList('b','g','a','h','l','q','t','s','c','x','e'));
        Collections.sort(chars,new Comparator<Character>(){
            public int compare(Character c1,Character c2){
                if(c1>c2){
                    return 1;
                }
                return -1;
            }
        });
        for(char ch:chars){
            System.out.println(ch);
        }
    }
}
