package lv.jg.homeWork.NumberService;

public class NumberService {

    //vārds "get" metodes nosaukumā liecina par to, ka metode atgriezīs rezultātu
    //metodei ir jaatgriež aprēķinatais rezultāts
    public void getEvenNumberCount(int from, int to) {
        int evenCount = 0;
        if (from < to) {
            //šo daļu var iznest atsevišķā metodē
            for (int i = from; i <= to; i++) {
                evenCount = evenNumberCount(evenCount, i);
            }
        } else {
            //un šo var izsaukt no metodes, padodot tai pretējos mainīgos
            for (int i = to; i <= from; i++) {
                evenCount = evenNumberCount(evenCount, i);
            }
        }
        System.out.println("Even Number count: " + evenCount); //return evenCount
    }

    //šai metodei ir javeic tikai aprēķins un jāatdod rezultāts
    //nekādas izvades nav nepieciešamas
    private int evenNumberCount(int evenCount, int i) {
        if (isEvenNumber(i)) {
            System.out.println(i + " Is Even number"); //šis nav nepiciešams
            evenCount++;
        } else {
            System.out.println(i + " Doen't count as Prime number!"); //arī šis ir lieks
        }
        return evenCount;
    }

    private boolean isEvenNumber(int number) {
        for (int i = 1; i < number; i++) {
            if (number % 2 == 0) {
                return true;
            }
        }
        return false;
    }

}

//komentēto tekstu ir jadzēš

//    public void printWithinInterval(int from, int to) {
//        for (int i = from; i <= to; i++) {              // for (; from < to; from++)
//            if (isPrimeNumber(i)) {
//
//                System.out.println(i + " Is Prime number");
//            } else {
//                System.out.println(i + " Doesn't count as Prime number!");
//            }
//        }
//    }
//
//    private boolean isPrimeNumber(int number) {
//        for (int i = 2; i < number; i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

