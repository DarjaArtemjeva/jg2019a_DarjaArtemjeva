package lv.jg.homeWork.ArrayService;


public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayService service = new ArrayService();
        int[] array = service.createArray(20);
        service.fillArrayWithRandomNumbers(array);
        service.printArrayToConsole(array);
        service.sumInArray(array);
    }
}
