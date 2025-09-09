package Basic;

public class PalindromCharAt {
    public static void main(String[] args) {
        String n = "maam";
        int s = 0 , e = n.length()-1;
        boolean pain = true;
        while(s < e ){
            if(n.charAt(s) !=  n.charAt(e)){
                pain = false;
                break;
            }
            s++;
            e--;
        }
        System.out.println(pain);
    }

}
