package com.company;


import java.util.Arrays;

public class Main {

    public static void merge(int arr[],int arr2[]){

        int left= arr.length-1;
        int right = 0;

        while (left>=0 && right<= arr.length-1){
            if (arr[left]>arr2[right]){
                int temp = arr[left];
                arr[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            }
            else {
                break;
            }
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);

    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,7};
        int arr2[] = {0,2,6,8,9};
        merge(arr,arr2);

        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for (int j=0;j< arr2.length;j++){
            System.out.print(arr2[j]+" ");
        }
        System.out.println();
    }
}


