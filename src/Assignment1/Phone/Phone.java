package Assignment1.Phone;

import java.io.Serializable;

public class Phone implements Serializable {
    private String number, model;
    private double weight;
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    public void receiveCall(String name){
        System.out.println(name + " is ringing");
    }

    public void receiveCall(String name, String number){ System.out.println(name + "is ringing by this number: " + number);}

    public void sendMessage(String... numbers) {
        System.out.println("Send message to this phone numbers: ");
        for (String number : numbers) {
            System.out.println(number + " ");
        }
    }

    public String getNumber() {
        return number;
    }

    public String getModel(){return model; }

    public double getWeight(){return weight;}
}


