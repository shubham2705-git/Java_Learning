package RevisionQuestions;

public class FindMissingEle {
    public static int findMissing(int[] arr,int n){
        int[] ans = new int[n+1];
        for(int i=0;i<n-1;i++){
            ans[arr[i]]= 1;
        }
        for(int i=1;i<ans.length;i++){
            if(ans[i]==0){
                return i;
            }
        }
        return 0;
    }
    public static int ans(int[] arr,int n){
        int xor1 = n;
        int xor2=0;
        for(int i=0;i<n-1;i++){
            xor1 = xor1^(i+1);
            xor2 = xor2^arr[i];
        }
        xor1=xor1^xor2;
        return xor1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,3};
        int n = 5;
        System.out.println(findMissing(arr,n));
        System.out.println(ans(arr,n));
    }
}
