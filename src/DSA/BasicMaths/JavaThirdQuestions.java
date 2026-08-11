package BasicMaths;

public class JavaThirdQuestions {
    public static void findPercentage(){
        int phy = 40;
        int chem = 60;
        int math = 34;
        int optional = 34;
        double ans = 0;
        int status = 0;

        if(phy < 35)
            status=1;
        if(chem < 35)
            status=1;
        if(math < 35){
            status=1;
        }
        if(optional < 35){
            status=1;
        }
        if(status==0){
            ans = (phy+chem+math+optional)/400.0 * 100.0;
            System.out.println(ans);
        }
        if(status==1){
            System.out.println("fail");
        }
    }
    public static void main(String[] args) {
        findPercentage();
    }
}
