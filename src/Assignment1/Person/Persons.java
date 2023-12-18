package Assignment1.Person;

public class Persons {
    private String fullName;
    private int age;

    public Persons(String fullName,int age){
        this.fullName = fullName;
        this.age = age;
    }

    public Persons(){

    }

    public void talk() {System.out.println(fullName + " is talking");}

    public void move() {System.out.println(fullName + " is moving");}
}
