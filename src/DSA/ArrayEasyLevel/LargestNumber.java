package ArrayEasyLevel;


public class LargestNumber {
    public static int largestElement(int[] arr)
    {
        int largest = 0;
        for(int i:arr)
        {
            if(i>largest)
            {
                largest = i;
            }
        }
        return largest;
    }
    public static void main(String[] args) {
      /*  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[n-1]); */

        int[] arr = {21,34,34,53,7,35,39,25,65,65};
        int result = largestElement(arr);
        System.out.println(result);
    }
}