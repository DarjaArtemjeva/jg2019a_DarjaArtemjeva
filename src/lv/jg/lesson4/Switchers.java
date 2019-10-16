package lv.jg.lesson4;

public class Switchers {
    public static void main(String[] args) {
        //int httpCode = 200;

        translateHttpCode(200);
    }

    private static void translateHttpCode(int httpCode) {
        switch (httpCode) {
            case 200:
                System.out.println(" nu OK");
                break;
            case 400:
                System.out.println("Bad request!");
                break;
            case 500:
                System.out.println("Server error - 500!");
                break;
            default:
                System.out.println("Unknown error!");
        }
    }
}
