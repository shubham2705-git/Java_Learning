package RevisionQuestions;

public class PalindromeArray {
    public static boolean check(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<arr.length/2){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr= {2,3,4,3,2};
        boolean result = check(arr);
        System.out.println(result);
    }
}
