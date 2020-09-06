package codingLeb;

public class Contains_Duplicate {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 5, 7, 3 };
		int[] arr1 = { 1, 2, 3, 4, 5, 6,9,0,11 };

		boolean result = false;

		for (int i = 0; i < arr.length - 1; i++) {
			if (result == true)
				break;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr1[i] == arr1[j]) {
					result = true;
					break;
				}

			}
		}
		
		System.out.println(result);

	}

}
