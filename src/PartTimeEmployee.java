public class PartTimeEmployee extends Employee{

    public PartTimeEmployee(String name) {
        super(name);
    }
    public void calculateSalary() {
        System.out.println("Part time salary!" + " name: " + getName());
    }
}
