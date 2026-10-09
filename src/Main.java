
void main() {
    //How to use Scanner
    Scanner scanner = new  Scanner(System.in);

    String name;
    int age = 0;
    double gpa;
    boolean isStudent;
    boolean isHappy;
    boolean isInteger = true;
    System.out.print("Enter your name: ");
    name = scanner.nextLine();

    System.out.print("Enter your age: ");
    if(scanner.hasNextInt()) {
        age = Integer.parseInt(scanner.nextLine());
    }
    else{
        isInteger = false;
        System.out.println("\nThis is not an integer!");
    }

    System.out.print("Enter your gpa: ");
    gpa = Double.parseDouble(scanner.nextLine());

    System.out.print("You are a student (true or false): ");
    isStudent = Boolean.parseBoolean(scanner.nextLine());

    System.out.print("you are happy (true or false): ");
    isHappy = Boolean.parseBoolean(scanner.nextLine());


    System.out.println("Hello " +name);

    if(isInteger){
        System.out.println("You are " + age + " years old");

    }else{
        System.out.println("You entered an invalid age!");
    }

    System.out.println((gpa <5.0) ? "your gpa is so bad" : "You are a great student!");
    if(isHappy){
        System.out.println("You are a happy person");
    }else{
        System.out.println("your are a unhappy person");
    }

    scanner.close();
}
