package com.Saisruti.dsa.arrays;
import java.lang.reflect.Array;
import java.util.Arrays;
public class KthMaxMinSorting {
    //Time complexity:O(n log n)
    //Approach:Sort the array and access index
    public static int findKthMin(int arr[],int K) {
        int[] copy = arr.clone();
        Arrays.sort(copy);
        return copy[K - 1];//Kth smallest
    }
    public static int findKthMax(int arr[],int K) {
        int[] copy = arr.clone();
        Arrays.sort(copy);
        return copy[copy.length - K];//Kth largest
    }
    public static void main(String[] args){
        int arr[]={6,7,3,4,9,0,2};
        int K=3;
        int kthmin = findKthMin(arr, K);
        int kthmax = findKthMax(arr, K);
        System.out.println("Kth Minimum:" + kthmin);
        System.out.println("Kth maximum:" + kthmax);
    }
    }


