package Assignment1.Animal;

public class Dog extends Animals {
    private String color;

    public Dog(String food, String location, String color){
        super(food, location);
        this.color = color;
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog is barking");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating " + food);
    }
}
