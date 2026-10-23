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

//    //OOP #2
//    try{
//        List<Shape> listShape = new ArrayList<Shape>();
//        listShape.add(new Circle(10.0));
//        listShape.add(new Circle(20.0));
//        listShape.add(new Triangle(3, 4, 5));
//        listShape.add(new Triangle(5, 5, 6));
//
//        for(Shape item : listShape) {
//            item.print();
//        }
//    }catch(Exception ex) {
//        System.out.println(ex.getMessage());
//    }

//    System.out.print("Enter name: ");
//    String name = scanner.nextLine(); //
//
//    System.out.print("Enter old: ");
//    int old = Integer.parseInt(scanner.nextLine());
//    System.out.print("Enter school name: ");
//    String schoolName = scanner.nextLine();
//
//    System.out.println("-------------------------");
//    System.out.println(name);
//    System.out.println(old);
//    System.out.println(schoolName);

    List<BankAccount> listAccount = new ArrayList<BankAccount>();
    //listAccount.add(new CheckingAccount("Dang Tung", 100, 100));
    listAccount.add(new SavingsAccount("Do Quyen", 100));
    for(BankAccount item : listAccount) {
        System.out.println("Account holder: " + item.getHolder());
        System.out.println("rut 110: " + item.withdraw(110));
        System.out.println("gui 200: " + item.deposit(200));
        System.out.println("Balance: " + item.getBalance());

    }


    scanner.close();
}