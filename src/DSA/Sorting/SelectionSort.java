package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int mini=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[mini]) mini=j;
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= {4, 8, 6, 2, 7, 9};
        System.out.println(Arrays.toString(arr));
        System.out.print("Sorted Array is: ");
        selectionSort(arr);
    }
}
