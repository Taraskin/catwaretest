package no.catware.worksheet.test;

public class MathProblemSolver {

    public static long sumNumbersMultipliesBy3Or5(int allNumbersLessThan) {
        long sum = 0;
        if (allNumbersLessThan >= 3) {
            for (int i = 3; i < allNumbersLessThan; i++) {
                if (i % 3 == 0 || i % 5 == 0)
                    sum += i;
            }
        }
        return sum;
    }
}
