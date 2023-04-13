package exercise;

public class ShopraSteriaAssert {

	public static void assertEqual(String actualValue, String expectedValue, String errorMessage) {

		if (actualValue.equals(expectedValue)) {

			System.out.println("---------pass---------");
		} else {

			System.out.println("---------failed---------");
			System.out.println(errorMessage);
		}

	}

	public static void assertEqual(String actualValue, String expectedValue) {

		if (actualValue.equals(expectedValue)) {

			System.out.println("---------pass---------");
		} else {

			System.out.println("---------failed---------");

		}

	}
	
	
	public static void assertTrue(String actualValue, String expectedValue) {

		if (actualValue.contains(expectedValue)) {

			System.out.println("---------pass---------");
		} else {

			System.out.println("---------failed---------");

		}

	}

}
