import java.util.Objects;

public abstract class Employee {
    private String name;

    public Employee(String name) {
        checkName(name);
        this.name = name.strip();
    }
    public String getName() {
        return name;
    }

    public void setName(String name){
        checkName(name);
        this.name = name.strip();
    }

    public abstract void calculateSalary();

    private static void checkName(String name){
        if(name == null){
            throw new NullPointerException("Name is null");
        }
        if(name.isBlank()){
            throw new IllegalArgumentException("Name is empty!");
        }
    }
}
