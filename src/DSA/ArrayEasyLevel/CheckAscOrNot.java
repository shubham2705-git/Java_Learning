package ArrayEasyLevel;

public class CheckAscOrNot {
    public static boolean check(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1]<arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println(check(arr));
    }
}
