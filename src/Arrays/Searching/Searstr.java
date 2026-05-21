package Arrays.Searching;

import java.util.*;

import java.util.*;

public class Searstr {
    public static void main(String[] args) {
        String name = "syam";
        char target = 'a';
        System.out.println(Search( name,target));

    }
    static boolean Search(String str , char th){
        for(char ch : str.toCharArray()){
            if(ch == th){
                return  true;

            }
        }
        return false;
    }
}
