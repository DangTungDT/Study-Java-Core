Scanner scanner = new  Scanner(System.in);
DateTimeFormatter[] dtf = new  DateTimeFormatter[]{
        DateTimeFormatter.ofPattern("dd/MM/yyyy"),
        DateTimeFormatter.ofPattern("dd-MM-yyyy")
};
void main() {

//    //OOP #1
//    List<Employee> listEmployee = new ArrayList<Employee>();
//    listEmployee.add(new PartTimeEmployee("A"));
//    listEmployee.add(new FullTimeEmployee("B"));
//    listEmployee.add(new PartTimeEmployee("c"));
//    listEmployee.add(new FullTimeEmployee("D"));
//    listEmployee.add(new PartTimeEmployee("E"));
//    listEmployee.add(new FullTimeEmployee("F"));
//    for(Employee item : listEmployee) {
//        item.calculateSalary();
//    }

    //OOP #2
    try{
        List<Shape> listShape = new ArrayList<Shape>();
        listShape.add(new Circle(10.0));
        listShape.add(new Circle(20.0));
        listShape.add(new Triangle(3, 4, 5));
        listShape.add(new Triangle(5, 5, 6));

        for(Shape item : listShape) {
            item.print();
        }
    }catch(Exception ex) {
        System.out.println(ex.getMessage());
    }
    scanner.close();
}