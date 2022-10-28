package sportelli.provaIngsw;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FunnyAlgorithmsTest {
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
		assert(funnyAlgorithms.stringToIntConverter(prova) != 0);
	}

	@Test
	public void shouldBeInteger() {
		String prova = "10";
		int number = 10;
		assertEquals(number, funnyAlgorithms.stringToIntConverter(prova));
	}

	@Test
	public void findPositionInArray() {
		int[] num = {3, 4, 9, 1, 8, 4};
		assertEquals(1, funnyAlgorithms.binarySearch(num, 4));
	}

}
