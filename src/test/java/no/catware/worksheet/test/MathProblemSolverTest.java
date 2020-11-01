package no.catware.worksheet.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathProblemSolverTest {

    @Test
    public void testSumLessThan3() throws Exception {
        assertEquals(0, MathProblemSolver.sumNumbersMultipliesBy3Or5(0));
        assertEquals(0, MathProblemSolver.sumNumbersMultipliesBy3Or5(1));
        assertEquals(0, MathProblemSolver.sumNumbersMultipliesBy3Or5(2));
        assertEquals(0, MathProblemSolver.sumNumbersMultipliesBy3Or5(3));
    }

    @Test
    public void testSumLessThan11() throws Exception {
        assertEquals(3, MathProblemSolver.sumNumbersMultipliesBy3Or5(4));
        assertEquals(3, MathProblemSolver.sumNumbersMultipliesBy3Or5(5));
        assertEquals(8, MathProblemSolver.sumNumbersMultipliesBy3Or5(6));
        assertEquals(14, MathProblemSolver.sumNumbersMultipliesBy3Or5(7));
        assertEquals(14, MathProblemSolver.sumNumbersMultipliesBy3Or5(8));
        assertEquals(14, MathProblemSolver.sumNumbersMultipliesBy3Or5(9));
        assertEquals(23, MathProblemSolver.sumNumbersMultipliesBy3Or5(10));
    }

    @Test
    public void testSumRandomLimit() throws Exception {
        assertEquals(60, MathProblemSolver.sumNumbersMultipliesBy3Or5(18));

        assertEquals(408, MathProblemSolver.sumNumbersMultipliesBy3Or5(42));
        assertEquals(450, MathProblemSolver.sumNumbersMultipliesBy3Or5(43));

        assertEquals(3420, MathProblemSolver.sumNumbersMultipliesBy3Or5(121));
        assertEquals(3543, MathProblemSolver.sumNumbersMultipliesBy3Or5(124));

        assertEquals(233168, MathProblemSolver.sumNumbersMultipliesBy3Or5(1000));
        assertEquals(234168, MathProblemSolver.sumNumbersMultipliesBy3Or5(1001));
    }
}