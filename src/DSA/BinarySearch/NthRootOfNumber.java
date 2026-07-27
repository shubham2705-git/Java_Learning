package BinarySearch;

public class NthRootOfNumber {
    public static double find(int n, int m) {
        double low = 1;
        double high = m;
        double eps = 1e-6;

        while (high - low > eps) {
            double mid = (low + high) / 2.0;
            double ans = Math.pow(mid, n);

            if (ans < m)
                low = mid;
            else
                high = mid;
        }
        return low;
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 255;
        System.out.println(find(n,m));
    }
}
