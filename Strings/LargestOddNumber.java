
public class Main {

    public static int odd(String str,int n){

        int currodd = 0;
        int maxodd = Integer.MIN_VALUE;

        for (int i=0; i<str.length(); i++){

            char ch = str.charAt(i);
            int digit = ch - '0';
            if (digit%2!=0){
                currodd = digit;
            }
            maxodd = Math.max(currodd,maxodd);
        }

        if (maxodd==Integer.MIN_VALUE){
            return -1;
        }

        return maxodd;
    }

    public static void main(String[] args) {
        String str = "52";
        int n = str.length();
        System.out.println(odd(str,n));

    }

}