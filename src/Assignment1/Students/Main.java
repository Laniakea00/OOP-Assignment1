package Assignment1.Students;

public class Main {
    public static void main(String[] args) {
        Aspirant aspirant = new Aspirant("John", "Doe", "GroupA", 5.0, "Research Work");

        Student studentReference = aspirant;

        System.out.println("Student Scholarship: " + studentReference.getScholarship() + "$");

        Student students[] = new Student[3];

        students[0] = new Student("Alan", "Berikzhan", "SE-23330", 3.25);
        students[1] = new Aspirant("Alibek", "Bobritosa", "SE-2777", 1.5, "1C programmer");
        students[2] = new Student("Ardak", "Abdulaev", "SE-2313", 3);

        for (Student student : students) {
            System.out.println("Scholarship for " + student.getFirstName() + " " + student.getLastName() +
                    ": " + student.getScholarship() + "$");
        }
    }
}
