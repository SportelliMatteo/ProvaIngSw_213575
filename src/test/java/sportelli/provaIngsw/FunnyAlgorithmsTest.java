package sportelli.provaIngsw;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FunnyAlgorithmsTest 
{
    public void shouldAnswerWithTrue() {
    	assertTrue(true);
    }
    
    private static FunnyAlgorithms funnyAlgorithms;
    
    @BeforeClass
	public static void beforeClassTest() {
		System.out.println("Before Class");
		funnyAlgorithms = new FunnyAlgorithms();
	}
    
    @Test
    public void shouldBeNotZero() {
    	String prova = "3000";
    	assert(FunnyAlgorithms.stringToIntConverter(prova) != 0);
    }
    
    @Test
    public void shouldBeInteger() {
    	String prova = "10";
    	int number = 10;
    	assert(FunnyAlgorithms.stringToIntConverter(prova) == number);
    }
    
    @Test
    public void shouldntHaveLetter() {
    	String prova = "A23";
    	assert(FunnyAlgorithms.stringToIntConverter(prova) == -1);
    }
}
