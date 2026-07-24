package ArrayEasyLevel;

public class PrintPair {
    public static void print(int[] arr){
        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print(arr[i]+"   " + arr[j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        print(arr);
    }
}
