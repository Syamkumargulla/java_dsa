package Basic;

import java.util.Set;

public class Countvowels {
    public static void main(String[] args) {
        String str = "Syam";
        str = str.toLowerCase();
       String vowles = "aeiou";
     int vow = 0;
        int con =0;
     /*

        for (int i = 0; i <str.length() ; i++) {  //for (char ch : str.toCharArray()) {
            char ch = str.charAt(i);
            if(vowles.indexOf(ch) != -1){
                vow++;
            }else {
                con++;
            }
        }
        System.out.println( "vowles:" + vow  + "con:" + con);

    */
        /*
        int con =0 ;
        for (char ch:str.toCharArray()) {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vow++;
            }else {
                con++;
            }


        }
        System.out.println(vow  +" " + con);
 */
        for(char ch:str.toCharArray()) {
            Set<Character> vowlesset = Set.of('a', 'e', 'i', 'o', 'u');
            if (vowlesset.contains(ch)){
                vow++;
            }else {
                con++;
            }
        }
        System.out.println(vow  +" " + con);
    }
}
