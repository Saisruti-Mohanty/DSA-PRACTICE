package com.Saisruti.dsa.arrays;

public class MoveNegative {
    public static void movenegative(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            if (arr[left] < 0) {
                left++;
            }
            else if(arr[right]>0){
                right--;
            }
            else{
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }

        }
    } public static void main(String[] args){
        int arr[]={1,-2,3,-9,7,-5,4};
        movenegative(arr);
        for(int i:arr){
            System.out.print(i+ " ");
        }
    }
}