package Assignment1.Animal;

public class Cat extends Animals {
    private String breed;

    public Cat(String food, String location, String breed){
        super(food, location);
        this.breed = breed;
    }
    @Override
    public void makeNoise(){
        System.out.println("Cat is meowing");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating " + food);
    }
}

