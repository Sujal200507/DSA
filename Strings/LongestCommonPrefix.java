package com.company;

import java.util.Arrays;

public class Main {


    public static String commonPrefixutil(String s1, String s2 ) {

        String result = "";
        int n1 = s1.length();
        int n2 = s2.length();

        for (int i = 0, j = 0; i < n1  && j < n2 ; i++, j++){
            if (s1.charAt(i) != s2.charAt(i)){
                break;
            }
            result = result + s1.charAt(i);

        }
        return result;

    }


    //function that return longest prefix
    public static String commonPrefix(String arr[], int n) {
        String prefix = arr[0];

        for (int i = 1; i < n ; i++) {
            prefix = commonPrefixutil(prefix, arr[i]);
        }

        return (prefix);
    }

    public static void main(String[] args){
        String arr[] = {"geeksforgeeks", "geeks",
                "geek", "geezer"};
        int n = arr.length;


        String ans = commonPrefix(arr,n);


        if (ans.length() > 0) {
            System.out.printf("The longest common prefix is - %s",
                    ans);
        } else {
            System.out.printf("There is no common prefix");
        }

    }
}