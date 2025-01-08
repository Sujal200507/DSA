package com.company;


public class Main {

    public static String reverse(String str,int n){

        int left =0;
        int right = str.length()-1;

        String temp = "";
        String ans = "";

        while (left<=right){

            char ch = str.charAt(left);
            if (ch!=' '){
                temp += ch;
            } else if (ch == ' ') {
                if (!ans.equals("")){
                    ans = temp + " "+ ans;
                }
                else {
                    ans = temp;
                }
                temp="";
            }
            left++;

        }

        if(!temp.equals("")){
            if (!ans.equals("")){
                ans  = temp + " " + ans;
            }
            else {
                ans = temp;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        String str = "hi my name is sujal";
        int n = str.length();

        System.out.println(reverse(str,n));
    }

}