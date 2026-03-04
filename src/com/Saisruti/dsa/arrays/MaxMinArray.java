package com.Saisruti.dsa.arrays;

public class MaxMinArray {
    public static int findMax(int[] arr){
        int max=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }return max;
    }
    public static int findMin(int[]arr){
        int min=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }return min;
    }public static void main(String[] args){
        int arr[]={6,7,3,4,9,0,2};
        int max=findMax(arr);
        int min=findMin(arr);
        System.out.println("Maximum:"+ max);
        System.out.println("Minimum:"+min);
    }
}
