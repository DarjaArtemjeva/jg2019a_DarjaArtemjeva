package lv.jg.lesson7;

public class MessageTest {
    public static void main(String[] args) {
        System.out.println("Instanses: " + Message.instancesCreated);
        new Message("Hello");
        System.out.println("Instanses: " + Message.instancesCreated);
        new Message("Its me");
        System.out.println("Instanses: " + Message.instancesCreated);
        new Message("How are you?");
        System.out.println("Instanses: " + Message.instancesCreated);
    }
}
