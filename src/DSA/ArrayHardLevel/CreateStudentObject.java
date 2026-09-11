package ArrayHardLevel;

class Student{
    String name;
    String quali;
    int yop;
    String gender;
    double percentage;
    Student(String name,String quali,int yop, String gender, double percentage){
        this.name = name;
        this.quali = quali;
        this.yop = yop;
        this.gender = gender;
        this.percentage = percentage;
    }
    void display(){
        System.out.println(name+" "+quali+" "+yop+" "+gender+" "+percentage);
    }
}
public class CreateStudentObject {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", "BTech", 2024, "Male", 82.5);
        Student s2 = new Student("Priya", "MCA", 2023, "Female", 88.0);
        Student s3 = new Student("Amit", "BE", 2025, "Male", 76.5);
        Student s4 = new Student("Sneha", "BTech", 2026, "Female", 91.0);
        Student s5 = new Student("Rohit", "MCA", 2027, "Male", 69.5);
        Student s6 = new Student("Anjali", "BE", 2024, "Female", 84.0);

        Student[] stud = {s1,s2,s3,s4,s5,s6};
        //display student details
        for(int i=0; i<stud.length; i++){
            stud[i].display();
        }
        System.out.println();
        System.out.println("===========================Student passed in 2026===============================");
        for(int i=0; i< stud.length; i++){
            if(stud[i].yop == 2026){
                stud[i].display();
            }
        }
        System.out.println("===========================Students done MCA/B.Tech/B.E and 2026/2025 and female===============================");
        for(int i=0; i< stud.length; i++){
                 if((stud[i].quali.equalsIgnoreCase("MCA") ||
                    stud[i].quali.equalsIgnoreCase("Btech")||
                    stud[i].quali.equalsIgnoreCase("BE")) &&
                    (stud[i].yop == 2026 || stud[i].yop == 2025) &&
                    (stud[i].gender.equalsIgnoreCase("female")))
                 {
                     stud[i].display();
                 }
        }
        System.out.println();
        System.out.println("=================Students passed from 2023 to 2027 and MCA only=================");
        for(int i=0; i<stud.length; i++){
            if((stud[i].yop>=2023 && stud[i].yop<=2027) && stud[i].quali.equalsIgnoreCase("mca")){
                stud[i].display();
            }
        }
        System.out.println();
        System.out.println("==============Number of males and females");
        int noOfMale = 0;
        int noOfFemale = 0;
        for(int i=0; i<stud.length; i++){
            if(stud[i].gender.equalsIgnoreCase("male")){
                noOfMale++;
            }
            else{
                noOfFemale++;
            }
        }
        System.out.println("Number of males: "+noOfMale);
        System.out.println("Number of female: "+noOfFemale);
    }
}
