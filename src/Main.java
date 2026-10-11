Scanner scanner = new  Scanner(System.in);
DateTimeFormatter[] dtf = new  DateTimeFormatter[]{
        DateTimeFormatter.ofPattern("dd/MM/yyyy"),
        DateTimeFormatter.ofPattern("dd-MM-yyyy")
};
void main() {

    try{
        Student[] students = inputStudentArray();

        printStudentArray(students);

        System.out.println("DONE");
    }catch(Exception e){
        System.out.println(e.getMessage());
    }



    scanner.close();
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