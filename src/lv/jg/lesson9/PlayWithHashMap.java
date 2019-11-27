package lv.jg.lesson9;

import java.util.HashMap;
import java.util.Map;

public class PlayWithHashMap {
    public static void main(String[] args) {
        Map<String, String> contacts = new HashMap<>();
        contacts.put("Bob", "555-2224-555");
        contacts.put("Alex", "434-9876-123");

        System.out.println(contacts);

        System.out.println(contacts.entrySet());

        for (Map.Entry<String, String> entry : contacts.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println("Bob's number is: " + contacts.get("Bob"));
        System.out.println("Alex's number is: " + contacts.get("Alex "));

    }
}
