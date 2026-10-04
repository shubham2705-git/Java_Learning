package ArrayEasyLevel;

public class FindDuplicateElements {
    public static void findDuplicate(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int num = arr[i];
            for(int j=i+1; j<arr.length; j++){
                if(num==arr[j]){
                    System.out.print(num+" ");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,6,7,8,3,4};
        findDuplicate(arr);
    }
}
