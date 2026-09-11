package ArrayHardLevel;

class Employee{
    String name;
    String company;
    String companyType;
    double salary;
    Employee(String n, String c, String ct, double s){
        this.name = n;
        this.company = c;
        this.companyType = ct;
        this.salary = s;
    }
    void display(){
        System.out.println(name +" "+company+" "+companyType+" "+salary);
    }
}
public class CreateEmployeeArray {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ramesh","TCS","Service",32000);
        Employee e2 = new Employee("Suresh","Kpmg","Service",75000);
        Employee e3 = new Employee("Mahesh","Oracle","product",105000);
        Employee e4 = new Employee("Ganesh","Walmart","product",165000);
        Employee e5 = new Employee("Rajesh","Infosys","Service",45000);

        Employee[] emp = {e1, e2, e3, e4 ,e5};
        // Printing all Employee details

        for(int i=0; i<emp.length; i++){
            emp[i].display();
        }
        System.out.println();
        System.out.println("===================Employee in Service based company==============================");
        for(int i=0; i<emp.length; i++){
            if(emp[i].companyType.equalsIgnoreCase("service")){
                emp[i].display();
            }
        }
        System.out.println();
        System.out.println("===================Employee in Infosys  company==============================");
        for(int i=0; i<emp.length; i++){
            if(emp[i].company.equalsIgnoreCase("infosys")){
                emp[i].display();
            }
        }
        System.out.println();
        System.out.println("===================Employee's salary between 35000 to 50000==============================");
        for(int i=0; i<emp.length; i++){
            if(emp[i].salary>35000 && emp[i].salary<50000){
                emp[i].display();
            }
        }
        System.out.println();
    }
}
