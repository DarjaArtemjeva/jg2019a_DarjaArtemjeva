package lv.jg.lesson7;

public class Message {
    public static int instancesCreated = 0;

    private String text;

    public Message (String text) {
        this.text = text;

        System.out.println("Creating new message: '" + text + "' ");
        instancesCreated++;

    }
}
