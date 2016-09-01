import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by RdDvls on 9/1/16.
 */
public class ChocolateMakerTest {
    ChocolateMaker chocolateMaker;
    @Before
    public void setUp() throws Exception {
        chocolateMaker = new ChocolateMaker();

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void makeChocolate() throws Exception {

    }
    @Test
    public void testEnoughSmallsNoBigs(){
        int numSmalls = chocolateMaker.makeChocolate(12,0,6);
        assertEquals(6, numSmalls);
    }
    @Test
    public void testEnoughBigsNoSmalls(){
        int numSmalls = chocolateMaker.makeChocolate(0,1,5);
        assertEquals(5, numSmalls);
    }
    @Test
    public void testNoSmallsNoBigs(){
        int numSmalls = chocolateMaker.makeChocolate(0,0,2);
        assertEquals(-1,numSmalls);
    }
    @Test
    public void testNegBigsEnoughSmalls(){
        int numSmalls = chocolateMaker.makeChocolate(2, -2, 2);
        assertEquals(2, numSmalls);
    }
    @Test
    public void testEnoughBigsNegSmalls(){
        int numSmalls = chocolateMaker.makeChocolate(-2, 2, 10);
        assertEquals(numSmalls, numSmalls);
    }
    @Test
    public void testNegBigsNegSmalls(){
        int numSmalls = chocolateMaker.makeChocolate(-2,-1,3);
        assertEquals(-1,numSmalls);
    }
    @Test
    public void testEnoughSmallsEnoughBigs(){
        int numSmalls = chocolateMaker.makeChocolate(2,1,7);
        assertEquals(2,numSmalls);
    }
    @Test
    public void testHugeSmallsHugeBigs(){
        int numSmalls = chocolateMaker.makeChocolate(100,100,20);
            assertEquals(20,numSmalls);
        }
    }

