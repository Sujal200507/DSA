
public class Main {

    public static boolean rotate(String str,String goal){

        if (str.length()!=goal.length()){
            return false;
        }
        return (str+str).contains(goal);
    }

    public static void main(String[] args) {
        String str = "abcde";
        String goal = "cdeab";
        int n = str.length();
        System.out.println(rotate(str,goal));

    }

}