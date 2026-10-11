import java.time.LocalDate;
import java.util.Objects;

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

        public static AcademiRank fromLabel(String input) {
            Objects.requireNonNull(input);
            String value = input.trim();

            for(AcademiRank rank : AcademiRank.values()){
                if(rank.label.equals(value)){
                    return rank;
                }
            }

            throw new IllegalArgumentException("Nhập học lực không hợp lệ: " + value);
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

        public static Level formLabel(String input) {
            Objects.requireNonNull(input);
            String value = input.trim();

            for(Level l : Level.values()){
                if(l.label.equals(value)){
                    return l;
                }
            }

             throw new IllegalArgumentException("Nhập cấp không hợp lệ: " + value);
        }
    }

    //Fields
    private final String student_Id;
    private String fullname;
    private LocalDate dateOfBirth;
    private Gender gender;
    private AcademiRank academiRank;
    private Level level;

    //Constructor
    public Student(String student_id, String fullname, LocalDate dateOfBirth, Gender gender, AcademiRank academiRank, Level level) {
        this.student_Id = student_id;
        this.fullname = fullname;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.academiRank = academiRank;
        this.level = level;
    }

    public String getStudentId() {
        return student_Id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = reqireTexe(fullname, "Fullname");
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        Objects.requireNonNull(dateOfBirth, "Date of birth cannot be null");
        if(dateOfBirth.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("dateOfBirth must not be in the future!");
        }
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = Objects.requireNonNull(gender, "Gender cannot be null");
    }

    public AcademiRank getAcademiRank() {
        return academiRank;
    }

    public void setAcademiRank(AcademiRank academiRank) {
        this.academiRank = Objects.requireNonNull(academiRank, "AcademiRank cannot be null");
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = Objects.requireNonNull(level, "Level cannot be null");
    }

    //Method
    public void print() {
        System.out.print(student_Id + " - " +  fullname + " - " + dateOfBirth + " - " + gender + " - " + academiRank + " - " + level);
    }

    //method require
    private static String reqireTexe(String value, String fieldName) {
        Objects.requireNonNull(value, fieldName.toUpperCase() + " must not be null");
        String trimmedValue = value.trim();
        if(trimmedValue.isEmpty()) {
            throw new IllegalArgumentException(fieldName + " must not be empty");
        }
        return  trimmedValue;
    }
}
