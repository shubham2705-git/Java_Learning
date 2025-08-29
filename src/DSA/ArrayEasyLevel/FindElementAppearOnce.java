package ArrayEasyLevel;

public class FindElementAppearOnce {
      public static int elementAppearOnce(int[] arr){
//=============== Optimal Solution ================
          int xor = 0;
          for(int i : arr){
              xor^=i;
          }
          return xor;
      }
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,3,5,5,4,4};
        int result = elementAppearOnce(arr);
        System.out.println(result);
    }
}
//----------------------------------------------------------------------------
// ============ BruteForce Solution ============
/*         for(int i: arr){
             int  nums = i;
             int  count = 0;
           for(int j : arr){
               if(j == nums)  count++;
           }
           if(count == 1) return nums;
         }
         return -1;     */

// =========== Better Solution ===============
/*       HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1; */
