package com.Saisruti.dsa.arrays;
import java.util.*;
public class KthLargestHeap {
    public static int findKthLargest(int arr[],int k){
        PriorityQueue<Integer>minHeap=new PriorityQueue<>();
        for (int num:arr){
            minHeap.add(num);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }return minHeap.peek();
    }public static void main(String[] args){
        int arr[]={7,10,4,3,20,15};
        int k=3;
        int result=findKthLargest(arr,k);
        System.out.println(result);
    }
}
