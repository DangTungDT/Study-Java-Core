Scanner scanner = new  Scanner(System.in);
DateTimeFormatter[] dtf = new  DateTimeFormatter[]{
        DateTimeFormatter.ofPattern("dd/MM/yyyy"),
        DateTimeFormatter.ofPattern("dd-MM-yyyy")
};
void main() {

    try{
//        Student[] students = inputStudentArray();
//
//        printStudentArray(students);
//
//        System.out.println("DONE");
//        caculateSum();
//        caculateSumVer2();
        int[] input = new int[]{
          1, 2, 3, 4, 5, 6, 8, 10, 11, 12, 13, 14, 15, 16
        };
        for(int item : input ) {
            if(kiemTraSoNguyenTo(item)){
                System.out.println(item );
            }
        }
    }catch(Exception e){

        System.out.println(e.getMessage());
    }
    scanner.close();
}

private boolean kiemTraSoNguyenTo(int number) {
    if(number < 2) return false;
    for(int i = 2; i<= number/2;i++ ){
        if(number % i == 0){
            return false;
        }
    }
    return true;
}
private void doExeriseRagex02() {
    String[] input = new  String[] {
            "I am learning Java",
            "JAVASCRIPT is different",
            "I like javascript",
            "java"
    };

    String regex = "^java$";
    Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
    Matcher matcher;
    for(String item : input) {
        matcher = pattern.matcher(item);
        if(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
private void doExeriseRegex01() {
    String[] input = new  String[] {
            "I am learning Java",
            "JAVASCRIPT is different",
            "I like javascript"
    };
    String regex = "^.*java.*$";
    Pattern pettern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
    Matcher matcher;

    for(String item : input) {
        matcher = pettern.matcher(item);
        if(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

private void caculateSumVer2() {
    //khong dung ArrayList
    int total = 0;
    while(true) {
        System.out.print("Nhập số: ");
        total += scanner.nextInt();
        System.out.print("Bạn có muốn nhập tiếp (Y/N): ");
        char choice = scanner.next().toLowerCase().charAt(0);
        if(choice !='y') {
            break;
        }
    }
    System.out.println("Tổng = "+ total);
}
private void caculateSum() {
    //Sử duụng ArrayList

    ArrayList<Integer> numbers = new ArrayList<>();
    while(true) {
        System.out.print("Nhập số: ");
        int value = scanner.nextInt();
        numbers.add(value);
        System.out.print("Bạn có muốn nhập tiếp (Y/N): ");
        char choice = scanner.next().toLowerCase().charAt(0);
        if(choice != 'y') {
            break;
        }
    }
    int result = 0;
    System.out.println("Tổng của");
    for(int item : numbers) {
        result += item;
        System.out.print(" " + item);
    }
    System.out.println("= " + result);

}
private void printStudentArray(Student[] students){
    try{
        System.out.println("In danh sách sinh viên....");
        Thread.sleep(2000);
        for(Student item :  students){
            item.print();
            System.out.println();
        }
    }catch(Exception e){

    }
}
private Student[] inputStudentArray() {
    System.out.print("Nhập số lượng học sinh: ");
    int totalStudents = Integer.parseInt(scanner.nextLine());
    Student[] students = new Student[totalStudents];
    for (int i = 1; i <= totalStudents; i++) {
        System.out.print("Nhập mã học sinh " +i + ": ");
        String id = scanner.nextLine();
        System.out.print("Nhập họ và tên học sinh " +i + ": ");
        String fullname = scanner.nextLine();
        System.out.print("Nhập ngày tháng năm sinh của học sinh " + i + ": ");
        String dateInput = scanner.nextLine();
        LocalDate dateOfBirth = LocalDate.now();
        for(DateTimeFormatter formar : dtf) {
            try{
                dateOfBirth = LocalDate.parse(dateInput.trim(), formar);
            }catch(DateTimeParseException e){

            }
        }

        System.out.print("Nhập giới tính của học sinh " + i +" (nam/nu/khac): ");
        String genderString = scanner.nextLine().toLowerCase().trim();
        Student.Gender gender;
        if(genderString.equals("nam")){
            gender = Student.Gender.MALE;
        }else if(genderString.equals("nu")){
            gender = Student.Gender.FEMALE;
        }else{
            gender = Student.Gender.OTHER;
        }

        System.out.print("Nhập học lực của học sinh " +i +": ");
        Student.AcademiRank academiRank = Student.AcademiRank.fromLabel(scanner.nextLine().trim());

        System.out.print("Nhập cấp của học sinh "+ i + ": ");
        Student.Level level = Student.Level.formLabel(scanner.nextLine().trim());

        Student newStudent = new Student(id, fullname, dateOfBirth, gender, academiRank, level);
        students[i-1] = newStudent;
    }


    System.out.println("Thêm thành công!");
    return students;
}