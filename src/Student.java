import java.time.LocalDate;

public class Student {
    //Constants
    public static final double Max_GPA = 100.0;
    public static final double Min_GPA = 0.0;

    //ENUM
    public enum Gender{
        MALE, FEMALE, OTHER
    }

    public enum AcademiRank{
        EXCELLENT("xuất sắc"),
        GOOD("giỏi"),
        FAIR("khá"),
        AVERAGE("trung bình"),
        POOR("yếu");

        private final String label;
        AcademiRank(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

    public enum Level{
        ELEMENTARY("Tiểu học"),
        MIDDLE("Trung học cơ sở"),
        HIGH("Trung học phổ thông"),
        COLLEGE("Cao đẳng"),
        UNIVERSITY("Đại học");

        private final String label;

        Level(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

    //Fields
    private final String student_Id;
    private String fullname;
    private LocalDate dateOfBirth;

}
