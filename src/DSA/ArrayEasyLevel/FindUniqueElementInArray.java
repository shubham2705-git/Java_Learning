package ArrayEasyLevel;

public class FindUniqueElementInArray {
    public static int findUnique(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            boolean flag = false;
            int num = arr[i];
            for(int j=i+1; j<arr.length; j++){
                if(num==arr[j]){
                    flag = true;
                }
            }
            if(!flag) return arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,1,4,5,5,4,2,2};
        System.out.println(findUnique(arr));
    }
}
