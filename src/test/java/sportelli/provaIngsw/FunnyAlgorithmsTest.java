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
		int[] num = {1, 2, 3, 4, 5, 6};
		assertEquals(1, funnyAlgorithms.binarySearch(num, 2));
	}
	
	@Test
	public void notFindPositionInArray() {
		int[] num = {1, 2, 3, 4, 5, 6};
		assertEquals(-1, funnyAlgorithms.binarySearch(num, 10));
	}
	
	@Test
	public void shouldBeSortedAscending() {
		int[] array = {1, 2, 3};
		int[] arrayCorretto = {3, 2, 1};
		funnyAlgorithms.selectionSort(array, 0);
		boolean check = false;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == arrayCorretto[i]) {
				check = true;
			}else {
				check = false;
				break;
			}
		}
		assertTrue(check);
	}
	
	@Test
	public void shouldBeSortedDescending() {
		int[] array = {3, 2, 1};
		int[] arrayCorretto = {1, 2, 3};
		funnyAlgorithms.selectionSort(array, 1);
		boolean check = false;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == arrayCorretto[i]) {
				check = true;
			}else {
				check = false;
				break;
			}
		}
		assertTrue(check);
	}
	
	@Test
	public void NotInIntervall() {
		String prova = "50000";
		assert(funnyAlgorithms.stringToIntConverter(prova) == 0);
	}
	

}
