package BasicMaths;

public class JavaSecondQuestions {
    public static void areaOfCube(){
        double a = 10.5;
        double ans = a * a;
        System.out.println(ans);
    }
    public static void areaOfparallelo(){
        double b = 10.5;
        double h = 10.5;
        double ans = b*h;
        System.out.println(ans);
    }
    public static void surfaceAreaOfSphere(){
        double r = 10.2;
        double ans = 4 * (22.0/7) * r * r;
        System.out.println(ans);
    }
    public static void surfaceAreaOfCone(){
        double r = 10.5;
        double l = 12.5;
        double ans = (22.0/7) * r * (r+l);
        System.out.println(ans);
    }
    public static void volumeOfCone(){
        double r = 10.5;
        double h = 10.2;
        double ans = (1.0/3) * (22.0/7) * r * r * h;
        System.out.println(ans);
    }
    public static void volumeOfCylinder(){
        double r = 10.5;
        double h = 10.2;
        double ans = (22.0/7) * r * r * h;
        System.out.println(ans);
    }
    public static void totalSufAreaOfCuboid(){
        double l = 10.5;
        double b = 10.5;
        double h = 10.5;
        double ans = 2 *( (l*b)+(b*h)+(b*h));
        System.out.println(ans);
    }
    public static void totalSurfaceAreaOfHemis(){
        double r = 10.5;
        double ans = 3*(22.0/7)*r*r;
        System.out.println(ans);
    }
    public static void totalSurfaceAreOfCube(){
        double a = 10.5;
        double ans = 6*a*a;
        System.out.println(ans);

    }
    public static void areaOfPentagon(){
        double p = 10.5;
        double h = 10.3;
        double ans = (1/2.0) * p * h;
        System.out.println(ans);

    }
    public static void main(String[] args) {
        areaOfCube();
        areaOfparallelo();
        surfaceAreaOfSphere();
        surfaceAreaOfCone();
        volumeOfCone();
        volumeOfCylinder();
        totalSufAreaOfCuboid();
        totalSurfaceAreaOfHemis();
        totalSurfaceAreOfCube();
        areaOfPentagon();
    }
}
