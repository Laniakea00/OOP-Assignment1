package Assignment1.Phone;

public class Main {
    public static void main(String[] arg){
        Phone phone1 = new Phone("8707-777-7777","iPhone 13",84);
        Phone phone2 = new Phone("8700-100-2030","Poco X3", 94);
        Phone phone3 = new Phone("8777-888-9999","Samsung S20", 104);

        System.out.println(phone1.getNumber() + phone1.getModel() + phone1.getWeight());
        System.out.println(phone2.getNumber() + phone2.getModel() + phone2.getWeight());
        System.out.println(phone3.getNumber() + phone3.getModel() + phone3.getWeight());

        phone1.receiveCall("Alan");
        phone2.receiveCall("Olzhas");
        phone3.receiveCall("Mikhail");

        phone1.receiveCall("Alan", "8707-777-7777");
        phone2.receiveCall("Olzhas", "8700-100-20-30");
        phone3.receiveCall("Mikhail","8777-888-9999");

        phone1.sendMessage("123-456-789","987-654-321");
        phone2.sendMessage("8707-777-7777","8700-100-2030","8777-888-9999");
    }
}
