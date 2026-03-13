package com.Saisruti.dsa.arrays;

public class Main {
    public static void findUnionIntersection(int arr1[], int arr2[]) {
        int i = 0, j = 0;
        System.out.print("union:");
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } else if (arr2[j] < arr1[i]) {
                System.out.print(arr2[j] + " ");
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
        while (i < arr1.length) {
            System.out.print(arr1[i] + " ");
            i++;
        }
        while (j < arr2.length) {
            System.out.print(arr2[j] + " ");
            j++;

        }
        System.out.println();
        i = 0;
        j = 0;
        System.out.println("intersection:");
        while (i<arr1.length && j<arr2.length){
            if (arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                System.out.print(arr1[i]+ " ");
                i++;
                j++;
            }
        }
    }
    public static void main(String []args){
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={2,3,5,7};
        findUnionIntersection(arr1,arr2);
    }
}
