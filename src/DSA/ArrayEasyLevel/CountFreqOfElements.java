package ArrayEasyLevel;

public class CountFreqOfElements {
    public static void countFreq(int[] arr){
        boolean[] freq = new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(!freq[i]){
                int count=1;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                        freq[j]=true;
                    }
                }
                System.out.println("Freq of "+arr[i]+" -> "+count);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,20,50,20,30,10,40,30};
        countFreq(arr);
    }
}
