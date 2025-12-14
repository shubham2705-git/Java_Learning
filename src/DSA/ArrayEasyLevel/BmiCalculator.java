package ArrayEasyLevel;

public class BmiCalculator {
    public static int calculateBmi(int threshold,double[] height,double[] weight){
        int count =0;
        for(int i=0; i<height.length; i++)
        {
            double bmi = (weight[i]/height[i] *10);
            if(bmi <= threshold){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int threshold = 4;
        double[] height = {165,170,176,180,155};
        double[] weight = {60,70,55,80,56};
        int result = calculateBmi(threshold,height,weight);
        System.out.println(result);
    }
}
