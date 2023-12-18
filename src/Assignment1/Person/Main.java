package Assignment1.Person;

public class Main {
    public static void main(String[] arg){
        Persons person1 = new Persons();
        Persons person2 = new Persons("Alan", 17);

        person1.talk();
        person2.move();
    }
}
