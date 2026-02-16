package recursion;

public class SumOfEleInArray {
    public static int sumOfEle(int[] arr, int i){
        if(i==arr.length)  return 0;
        return arr[i]+sumOfEle(arr,i+1);
    }
    public static void main(String[] args) {
        int[] arr = {4,3,5,6};
        System.out.println(sumOfEle(arr,0));
    }
}
