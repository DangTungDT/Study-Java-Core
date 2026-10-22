public class FullTimeEmployee extends Employee{

    public FullTimeEmployee(String name){
        super(name);
    }
    public void calculateSalary() {
        System.out.println("Full time salary!" + " name: " + getName());
    }
}
