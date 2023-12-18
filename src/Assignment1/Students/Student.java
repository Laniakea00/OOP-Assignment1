package Assignment1.Students;

public class Student {
    private String firstName, lastName, group;
    private double gpa;

    public Student(String firstName, String lastName, String group, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.gpa = gpa;
    }

    public int getScholarship(){
        if(gpa == 5.0){
            return 100;
        }
        else {
            return 80;
        }
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getGroup(){
        return group;
    }

    public double getGpa(){
        return gpa;
    }
}

