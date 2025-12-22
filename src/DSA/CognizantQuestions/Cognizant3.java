package CognizantQuestions;

public class Cognizant3 {
    public static int print(int[] arr){
        int sumLeft=0;
        int count=0;
        for(int i=0;i<arr.length-1;i++){
                sumLeft+=arr[i];
                int j=i+1;
                int sumRight=0;
                while(j<arr.length){
                    sumRight+=arr[j];
                    j++;
                }
                if(Math.abs(sumLeft-sumRight)%2==0){
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={10,10,3,7,6};
        System.out.println(print(arr));
    }
}
