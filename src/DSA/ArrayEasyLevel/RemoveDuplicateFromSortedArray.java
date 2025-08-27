package ArrayEasyLevel;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
//==== Easy Solution is store all elements into Set ========
        int arr[] = {1,1,2,2,2,3,3,3,3,4,4,4,4,5,5,5,6,6,6,6,8,8};
        int i = 0;
        for( int j=1; j<arr.length; j++)
        {
            if(arr[j] != arr[i])
            {
                i++;
                arr[i] = arr[j];
            }
        }
        for(int k = 0 ; k <= i ; k++)
        {
            System.out.print(arr[k]+",");
        }
    }
}
