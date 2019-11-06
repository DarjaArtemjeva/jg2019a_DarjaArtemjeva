package lv.jg.homeWork.LightColorDetector;

import java.util.Scanner;

public class LightColorDetector {
    public String detect(int waveLength) {
        if (waveLength >= 380 && waveLength < 450) {
            return "VIOLET";
        } else if (waveLength >= 450 && waveLength < 495) {
            return "BLUE";
        } else if (waveLength >= 495 && waveLength < 570) {
            return "GREEN";
        } else if (waveLength >= 570 && waveLength < 590) {
            return "YELLOW";
        } else if (waveLength >= 590 && waveLength < 620) {
            return "ORANGE";
        } else if (waveLength >= 620 && waveLength < 750) {
            return "RED";
        } else {
            return "Wrong length";
        }
    }

    public static void main(String[] args) {

    }

}
