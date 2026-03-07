package com.Saisruti.dsa.arrays;
import java.util.PriorityQueue;
public class KthLargestHeapKthLargestHeap {

       public static int findKthLargest(int [] arr,int k) {
           PriorityQueue<Integer> minHeap = new PriorityQueue<>(); //CREATES A MIN HEAP
           //TRAVERSE THE ARRAY
           for (int num : arr) {
               minHeap.add(num);
               if (minHeap.size() > k) {
                   minHeap.poll();//remove smallest
               }
           }
           return minHeap.peek();//kth largest
       }
        public static void main(String[] args) {

            int arr[] = {7, 10, 4, 3, 20, 15};
            int k = 3;

            System.out.println("Kth Largest Element: " + findKthLargest(arr, k));
        }
    }

