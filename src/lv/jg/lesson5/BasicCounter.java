package lv.jg.lesson5;

class BasicCounter {
    private int counterValue;

    public void increment(){ //metode increment
        counterValue ++;
    }

    public void decrement(){
        counterValue --;
    }

    public void clear(){
        counterValue = 0;
    }

    public int getValue() {
        return counterValue;
    }

    public void setValue(int counterValue) {
//        //this.counterValue = counterValue; //this - versamies pie class laukuma "private int counterValue"
//        if (counterValue >=0) {
//            this.counterValue = counterValue;
//        } else {
//            this.counterValue = 0;
//        }
        this.counterValue = counterValue > 0 ? counterValue : 0;

    }
}

