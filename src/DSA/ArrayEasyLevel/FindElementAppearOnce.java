package ArrayEasyLevel;

public class FindElementAppearOnce {
      public static int elementAppearOnce(int[] arr){
          int xor = 0;
          for(int i : arr){
              xor^=i;
          }
          return xor;
      }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4};
        int result = elementAppearOnce(arr);
        System.out.println(result);
    }
}
