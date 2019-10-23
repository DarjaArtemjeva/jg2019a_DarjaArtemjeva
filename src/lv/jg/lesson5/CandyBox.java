package lv.jg.lesson5;

import java.util.Objects;

public class CandyBox {
    private String name;
    private int amount;

    CandyBox (String name, int amount){
        this.name = name;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        CandyBox candyBox = (CandyBox) object;

        return this.name.equals(candyBox.name); //&& this.amount == candyBox.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount);
    }

    @Override
    public String toString(){
        return "CandyBox: { " + "name: " + name + "amount: " + amount + "}"; // izraksta uz ekranu
    }
}
