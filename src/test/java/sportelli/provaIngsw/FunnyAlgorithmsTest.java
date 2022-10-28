package sportelli.provaIngsw;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FunnyAlgorithmsTest 
{
    public void shouldAnswerWithTrue() {
    	assertTrue(true);
    }
    
    @Test
    public void shouldBeNotZero() {
    	String prova = "4000";
    	assert(FunnyAlgorithms.stringToIntConverter(prova) != 0);
    }
}
