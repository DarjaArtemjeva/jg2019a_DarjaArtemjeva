package lv.jg.lesson9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PlayWithArrayList {
    public static void main(String[] args) {

        List<String> cryptoCurrencies = new ArrayList<>();
        populateList(cryptoCurrencies);

        System.out.println("Size: " + cryptoCurrencies.size());
        System.out.println("Contains 'Wase': " + cryptoCurrencies.contains("Wase")); //pārbauda vai ir objekts 'Wase' massīvā
        System.out.println(cryptoCurrencies); //izdruka visus objektus massīvā

        Collections.sort(cryptoCurrencies); //sakarto
        System.out.println(cryptoCurrencies);

        Collections.reverse(cryptoCurrencies); //sakarto otradi
        System.out.println(cryptoCurrencies);

        cryptoCurrencies.remove("Wase");
        System.out.println(cryptoCurrencies);

        List<String> myCoinList = new MyArrayList();
        myCoinList.add("Wase");
        System.out.println(myCoinList);
        myCoinList.remove("Wase");
        System.out.println(myCoinList);
    }

    private static void populateList(List<String> list) {
        list.add("LightCoin");
        list.add("Wase");
        list.add("BitCoin");
        list.add("Etherium");
    }
}
