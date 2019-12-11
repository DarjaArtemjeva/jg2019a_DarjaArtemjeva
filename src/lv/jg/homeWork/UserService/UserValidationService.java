package lv.jg.homeWork.UserService;

public class UserValidationService {
    public static void main(String[] args) {
        shouldCreateUser();
        shouldFailIfInputValueToSmall();
        shouldFailIfInputValueToLarge();
    }

    private static void shouldCreateUser() {
        User user = new User("Janis", "Ozols", 15);
    }

    private static void shouldFailIfInputValueToSmall() {
        System.out.println("-----------------------------------");
        boolean result = false;
        try {
            User user = new User("J", "Ozols", 2);
        } catch (IllegalArgumentException ex) {
            result = true;
        }
        System.out.println("Test: shouldFailIfInputValueToSmall");
        System.out.println(result ? "SUCCESS" : "FAILED");
    }

    private static void shouldFailIfInputValueToLarge() {
        System.out.println("-----------------------------------");
        boolean result = false;
        try {
            User user = new User("Janis", "Ozols111", 199);
        } catch (IllegalArgumentException ex) {
            result = true;
        }
        System.out.println("Test: shouldFailIfInputValueToLarge");
        System.out.println(result ? "SUCCESS" : "FAILED");
    }
}
