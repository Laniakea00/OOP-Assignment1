package Assignment1.Animal;

public class Horse extends Animals {
    private String age;

    public Horse(String food, String location, String age){
        super(food, location);
        this.age = age;
    }
    @Override
    public void makeNoise(){
        System.out.println("Horse is heighing");
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating " + food);
    }
}

