package lv.jg.lesson6;

public class PlayWithLoops {
    public static void main(String[] args) {
        PlayWithLoops playWithLoops = new PlayWithLoops();

        playWithLoops.playWithWhileLoop();
        playWithLoops.playWithForLoop();
        playWithLoops.playWithDoWhileLoop();
        playWithLoops.playWithLoopBranching();


    }

    private void playWithLoopBranching() {
        System.out.println();
        for (int i = 0; i <= 10; i++) {
            if (i == 8) {
                System.out.println("Break!");
                break;
            }
            if (i == 2){
                System.out.println("Continue!");
                continue;
            }
            System.out.print(i + " ");
        }
    }

    private void playWithDoWhileLoop() {
        int i = 0;
        System.out.println(" ");
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
    }

    private void playWithForLoop() {
        System.out.println(" ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }

    private void playWithWhileLoop() {
        System.out.println();
        int i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

    }
}
