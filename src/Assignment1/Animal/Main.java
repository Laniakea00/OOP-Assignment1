package Assignment1.Animal;

public class Main {
    public static void main(String[] arg){
        Veterinary vet = new Veterinary();

        Animals[] animals = new Animals[3];

        animals[0] = new Dog("Bones", "Kanada","BLACK");
        animals[1] = new Cat("Rat", "Shotland", "Shotland");
        animals[2] = new Horse("Hay", "Franch", "5");

        for(Animals animal : animals){
            vet.treatAnimal(animal);
        }
    }
}
