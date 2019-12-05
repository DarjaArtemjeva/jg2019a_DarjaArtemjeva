package lv.jg.homeWork.ArrayService;

import java.util.Random;
import java.util.stream.IntStream;

public class ArrayService {
    public static void main(String[] args) {
    }
    public  void fillArrayWithRandomNumbers(int[] array){
        Random randomGenerator = new Random();
            for (int i = 0; i<array.length; i++){
                array[i] = randomGenerator.nextInt(101);
            }
    }
    public void printArrayToConsole(int[] array){
        for (int number : array){
            System.out.print(number + " ");
            System.out.println();
        }
    }

    public void sumInArray(int[] array){
        int numberSum = IntStream.of(array).sum();
        System.out.println("The sum of all numbers in array is: " + numberSum);
    }

    public int[] createArray(int size) {
        return new int[size];
    }
}
