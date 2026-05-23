package Arrays;

public class evennumberofdigit {
    public static void main(String[] args) {
        int[] nums = {12,343,2,4,3546};
        System.out.println(fint(nums));


    }
    static int fint(int[] nums){
        int count =0;
        for(int num : nums) {
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
         int numof = digit(num);
        /* if (numof %2 == 0){
             return true;
        }
         return false; */
        return  numof %2 ==  0;
    }
  /*  static  int digit2(int num){
        return  (int)(Math.log10(num))+1;
    }*/
    static int digit(int num){
        if(num < 0){
            num = num * -1;
        }
        if(num ==0){
            return  1;
        }
        int countt = 0;
       while (num>0){
           countt ++;
           num = num/10;
       }
       return  countt;
    }
}
