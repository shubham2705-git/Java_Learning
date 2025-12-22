package CognizantQuestions;

public class Cognizant4 {
    public static int print(int[] arr){
        int count=0;
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]+arr[i+2]==arr[i+1]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1,2,1,3,5,2,4,2};
        System.out.println(print(arr));
    }
}
