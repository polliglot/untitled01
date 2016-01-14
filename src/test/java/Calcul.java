/**
 * Created by m18 on 14.01.2016.
 */
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

//import static org.junit.Assert.assertEquals;



public class Calcul {

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");

    }

    @Test
    public void testAddTwoPositiveValues() {
        // Class for testing
        Run calc = new Run();

        // Method to check
        assertEquals("10 + 5 must be 15", 15, calc.add(10, 5));
    }

    @Test
    public void testAddTwoNegativeValues() {
        // Class for testing
        Run calc = new Run();

        // Method to check
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));

    }

    @Test
    public void testAddNegativePositiveValues() {
        // Class for testing
        Run calc = new Run();

        // Method to check
        assertEquals("10 + -5 must be 5", 5, calc.add(10, -5));

    }


    @Test
    public void testAddTwoValues() {
        // Class for testing
        Run calc = new Run();

        // Method to check
        assertEquals("1000 + 1000 must be 2000", 2000, calc.add(1000, 1000));

    }

    @Test
    public void testAddTwo() {
        // Class for testing
        Run calc = new Run();

        // Method to check
        assertEquals("215 + -5 must be 210", 210, calc.add(215, -5));

    }

    @Test
    public void testTwoNegativeValues() {
        // Class for testing
        Run calc = new Run();

        // Method to check
        assertEquals("-110 + -510 must be -620", -620, calc.add(-110, -510));

    }

    @Test
    public void testZeroValues() {
        // Class for testing
        Run calc = new Run();

        // Method to check
        assertEquals("0 + 0 must be 0", 0, calc.add(0, 0));

    }


    @Test
    public void testAddTwoFloatPointValues() {
        // Class for testing
        Run calc = new Run();

        // Method to check
        assertEquals("25.1 + 25.1 must be 50.2", 50.2, calc.sumfloatvalues(25.1, 25.1), 0.01);

    }

    @Test
    public void testOtnimanieTwoValues() {
        // Class for testing
        Run calc = new Run();

        // Method to check
        assertEquals("25 - 20 must be 5", 5, calc.otn(25, 20));

    }


    @Test
    public void testDelenieValues() {
        // Class for testing
        Run calc = new Run();

        // Method to check
        assertEquals("44 / 2 must be 22", 22, calc.del(44, 2));

    }


    @Test
    public void testKoren() {
        // Class for testing
        Run calc = new Run();

        // Method to check
        assertEquals("koren 144 must be 12", 12, calc.koren(144), 0.1);

    }

    @Test
    public void testUmnojenie() {
        // Class for testing
        Run calc = new Run();

        // Method to check
        assertEquals("5*3*2 must be 30", 30, calc.umn(5, 3, 2));

    }


    @Test
    public void testStepen() {
        // Class for testing
        Run calc = new Run();

        // Method to check
        assertEquals("5^2 must be 25", 25, calc.step(5), 0.1);

    }




    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!! ");

    }
}








