package lv.jg.lesson9;

import java.util.ArrayList;

public class MyArrayList extends ArrayList {
    @Override
    public boolean remove(Object o) {
        while (super.contains(o)){
            super.remove(o);
        }
        return true;
    }
}
