package StringZeroToHero;

public class CheckLeader {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        find(arr);
    }

    private static void find(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(isLeader(arr,i)) System.out.println(arr[i]);
        }
    }

    private static boolean isLeader(int[] arr, int i) {
        for(int j=i+1;j< arr.length;j++){
            if(arr[i]<arr[j]) return false;
        }
        return true;

    }
}
