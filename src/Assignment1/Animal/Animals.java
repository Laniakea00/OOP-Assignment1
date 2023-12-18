package Assignment1.Animal;

public class Animals {
    protected String food, location;

    public Animals(String food, String location){
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Such an animal is making noise");
    }

    public void eat() {
        System.out.println("Assignment1.Animal is eating " + food);
    }

    public void sleep() {
        System.out.println("Such an animal is sleeping");
    }
}
