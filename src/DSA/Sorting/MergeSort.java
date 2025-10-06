package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void merge(int[] arr,int low,int mid,int high){
        int left = low;
        int right = mid+1;
        List<Integer> list = new ArrayList<>();
        while(left<=mid && right<=high){
            if(arr[left] <= arr[right]){
                list.add(arr[left]);
                left++;
            }else{
                list.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            list.add(arr[left]);
            left++;
        }while(right<=high){
            list.add(arr[right]);
            right++;
        }
        for(int i:list){
            arr[low++] = i;
        }
    }
    public static void mergeSort(int[] arr,int low,int high){
        if(low==high) return;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void mS(int[] arr){
        mergeSort(arr,0,arr.length-1);
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        mS(arr);
        System.out.println(Arrays.toString(arr));
    }
}
