package lv.jg.homeWork.Cars;

public class Cars {
    protected String logo;
    protected String color;

    public Cars (String logo, String color){
        this.logo = logo;
        this.color = color;
    }

    @Override
    public String toString(){
        return "\nMy logo is " + logo
                + "\nMy color is " + color;
    }
}
