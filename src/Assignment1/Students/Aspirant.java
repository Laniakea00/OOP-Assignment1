package Assignment1.Students;

public class Aspirant extends Student {
    private String work;

    public Aspirant(String firstName, String lastName, String group, double gpa, String work) {
        super(firstName, lastName, group, gpa);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    @Override
    public int getScholarship() {
        if (getGpa() == 5.0) {
            return 200;
        }
        else {
            return 180;
        }
    }
}

