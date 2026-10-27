package ArrayEasyLevel;

public class CheckDescOrNot {
        public static boolean check(int[] arr){
            for(int i=0; i<arr.length-1; i++){
                if(arr[i+1]>arr[i]){
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {
            int[] arr = {50,40,30,20,10};
            System.out.println(check(arr));
        }
    }
