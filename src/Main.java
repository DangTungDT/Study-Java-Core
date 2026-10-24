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

     List<BankAccount> listAccount = new ArrayList<BankAccount>();

    while(true) {
        listAccount.add(createBankAccount());
        System.out.print("Press T/t to continue creating an account: ");
        String input = scanner.nextLine().trim();
        if(input.isEmpty()){
            break;
        }
        if(input.toLowerCase().charAt(0) != 't'){
            break;
        }
    }

    System.out.println("List of created account: ");
    for(BankAccount account : listAccount) {
         account.print();
    }
    scanner.close();
}

BankAccount createBankAccount() {
    int typeAccount = -1;
    System.out.print("Enter your name: ");
    String nameHolder = scanner.nextLine().trim();
    System.out.println("1. CheckingAccount\n2. SavingAccount");

     while(true) {
         System.out.print("Choose an account type (1 or 2): ");
         typeAccount = Integer.parseInt(scanner.nextLine());
         if(typeAccount == 1) {
             System.out.println("You have selected a checking account");
             System.out.print("Enter balance limit: ");
             double limit = Double.parseDouble(scanner.nextLine());

             CheckingAccount account = new CheckingAccount(nameHolder, 0,limit);
             return account;
         }else if(typeAccount == 2) {
             System.out.println("You have selected a saving account");
             SavingsAccount account = new SavingsAccount(nameHolder, 0);
             return account;
         }else{
             System.out.println("Choose an type account failed!");
         }
     }
}