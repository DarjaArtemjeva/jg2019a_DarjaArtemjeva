package lv.jg.lesson4.vowelcheker;

public class VovelChekerTest {
    VowelChecker vowelChecker = new VowelChecker();
    void shouldFindAllVowel() {
        check(true, vowelChecker.isVowel('A'), "shouldBeVowel_A");
        boolean expectedResult = true;
        boolean actualResult = vowelChecker.isVowel('A');
        if (actualResult == expectedResult) {
            System.out.println(" has PASSED");
        }   else {
            System.out.println(" has FAILED");
            System.out.println("Actual: " + actualResult + ", but Expected: " + expectedResult);
        }
    }

    void shouldFindAllConsonants() {

    }

    static void check(boolean expectedResult, boolean actualResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " has PASSED");
        }   else {
            System.out.println(testName + " has FAILED");
            System.out.println("Actual: " + actualResult + ", but Expected: " + expectedResult);
        }
   }

    public static void main(String[] args) {
        //VovelChekerTest testRunner = new VovelChekerTest();
        VowelChecker vowelChecker = new VowelChecker();

        boolean expectedResult = true;
        boolean actualResult = vowelChecker.isVowel('A');
        check(expectedResult, actualResult, "shouldBeVowel_A");

        expectedResult = true;
        actualResult = vowelChecker.isVowel('E');
        check(expectedResult, actualResult, "shouldBeVowel_E");

        expectedResult = true;
        actualResult = vowelChecker.isVowel('I');
        check(true, vowelChecker.isVowel('I'), "shouldBeVowel_E");


        if (actualResult == expectedResult) {
            System.out.println(" has PASSED");
        }   else {
            System.out.println(" has FAILED");
            System.out.println("Actual: " + actualResult + ", but Expected: " + expectedResult);
        }
    }

}
