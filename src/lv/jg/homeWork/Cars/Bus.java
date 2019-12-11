package lv.jg.homeWork.Cars;

public class Bus extends Cars {
    protected int passengerNumber;

    public Bus(String logo, String color, int passengerNumber){
        super(logo, color);
        this.passengerNumber=passengerNumber;
    }
    @Override
    public String toString(){
        return "\nMy logo is " + logo
                + "\nMy color is " + color
                + "\nMy passenger number is " + passengerNumber;
    }
}
