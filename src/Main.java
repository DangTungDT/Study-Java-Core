Scanner scanner = new  Scanner(System.in);
DateTimeFormatter[] dtf = new  DateTimeFormatter[]{
        DateTimeFormatter.ofPattern("dd/MM/yyyy"),
        DateTimeFormatter.ofPattern("dd-MM-yyyy")
};
void main() {

    //Polymorphism
    List<Employee> listEmployee = new ArrayList<Employee>();
    listEmployee.add(new PartTimeEmployee("A"));
    listEmployee.add(new FullTimeEmployee("B"));
    listEmployee.add(new PartTimeEmployee("c"));
    listEmployee.add(new FullTimeEmployee("D"));
    listEmployee.add(new PartTimeEmployee("E"));
    listEmployee.add(new FullTimeEmployee("F"));

     for(Employee item : listEmployee) {
         item.calculateSalary();
     }


    scanner.close();
}