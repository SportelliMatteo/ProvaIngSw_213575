package sportelli.provaIngsw;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FunnyAlgorithmsTest {

	private static FunnyAlgorithms funnyAlgorithms;

	@BeforeClass
	public static void beforeClassTest() {
		System.out.println("Before Class");
		funnyAlgorithms = new FunnyAlgorithms();
	}

	@Test
	public void shouldBeNotZero() {
		System.out.println("Test iniziato a: " + LocalTime.now());
		String prova = "3000";
		assert(funnyAlgorithms.stringToIntConverter(prova) != 0);
		System.out.println("Test finito a: " + LocalTime.now());
	}

	@Test
	public void shouldBeInteger() {
		System.out.println("Test iniziato a: " + LocalTime.now());
		String prova = "10";
		int number = 10;
		assertEquals(number, funnyAlgorithms.stringToIntConverter(prova));
		System.out.println("Test finito a: " + LocalTime.now());
	}
	
	@Test
	public void notInIntervall() {
		System.out.println("Test iniziato a: " + LocalTime.now());
		String prova = "50000";
		assert(funnyAlgorithms.stringToIntConverter(prova) == 0);
		System.out.println("Test finito a: " + LocalTime.now());
	}

	@Test
	public void findPositionInArray() {
		System.out.println("Test iniziato a: " + LocalTime.now());
		int[] num = {1, 2, 3, 4, 5, 6};
		assertEquals(1, funnyAlgorithms.binarySearch(num, 2));
		System.out.println("Test finito a: " + LocalTime.now());
	}
	
	@Test
	public void notFindPositionInArray() {
		System.out.println("Test iniziato a: " + LocalTime.now());
		int[] num = {1, 2, 3, 4, 5, 6};
		assertEquals(-1, funnyAlgorithms.binarySearch(num, 10));
		System.out.println("Test finito a: " + LocalTime.now());
	}
	
	@Test
	public void shouldBeSortedAscending() {
		System.out.println("Test iniziato a: " + LocalTime.now());
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
		System.out.println("Test finito a: " + LocalTime.now());
	}
	
	@Test
	public void shouldBeSortedDescending() {
		System.out.println("Test iniziato a: " + LocalTime.now());
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
		System.out.println("Test finito a: " + LocalTime.now());
	}
	
	
	

}
