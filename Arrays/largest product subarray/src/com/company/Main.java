package com.company;


import java.util.Arrays;

public class Main {

  public static int product(int arr[]){

      int maxproduct = 0;

      for (int i=0;i< arr.length;i++){
          for (int j=i+1;j<arr.length;j++){
              int currproduct=1;

              for (int k=i;k<=j;k++){
                  currproduct = currproduct * arr[k];
              }
              maxproduct = Math.max(currproduct,maxproduct);
          }
      }
      return maxproduct;
  }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,0};
        System.out.println(product(arr));
    }
}


