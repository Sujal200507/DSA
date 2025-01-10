import java.util.Arrays;
import java.util.*;
public class Main {

    public static int deepnesting(String str,int n){

        int maxcount = 0;
        int currcount=0;

        for (int i=0;i<n; i++){


            if (str.charAt(i)=='('){
                currcount++;
                maxcount = Math.max(currcount,maxcount);
            } else if (str.charAt(i)==')') {
                currcount--;

            }
        }
        return maxcount;
    }

    public static void main(String[] args) {
        String str = "(1+(2*3)+((8)/4))+1";
        int n = str.length();
        System.out.println(deepnesting(str,n));
    }

}