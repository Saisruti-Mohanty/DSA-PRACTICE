package com.Saisruti.dsa.arrays;
import javax.swing.*;
public class KthSmallestQuickSelect {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];// LAST ELEMENT
        //pointer initialization
        int i = low; //tracks the position where smaller elements will be placed
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; //swap element at i with element at j
                i++;
            }
        }
        //place the pivot in its correct sorted position
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    public static int quickSelect(int arr[], int low, int high, int k) {
        if (low <= high) {
            int pi = partition(arr, low, high); //call function
            if (pi == k) {
                return arr[pi];
            } else if (pi > k) {
                return quickSelect(arr, low, pi - 1, k);
            } else {
                return quickSelect(arr, pi + 1, high, k);
            }

        }
        return -1;
    }

        public static void main (String[]args){
            int arr[] = {7, 10, 4, 3, 20, 15};
            int k = 3;
            int result = quickSelect(arr, 0, arr.length - 1, k - 1);
            System.out.println("Kth smallest=" + result);

        }
    }
