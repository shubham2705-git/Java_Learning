package HashMap;

public class IntToRoman {
    public static void convert(int num) {
        int[] val =   {1000, 900, 500, 400,  100, 90,   50,  40,   10,   9,    5,  4,    1};
        String[] sys ={"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();

        for(int i=0;i<val.length;i++){
            if(num==0) break;

            int times = num/val[i];
            while(times>0)
            {
                result.append(sys[i]);
                times--;
            }
            num=num%val[i];
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        int n  = 1997;
        convert(n);
    }
}
