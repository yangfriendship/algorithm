package prm;

public class solve2 {
	static String hands;
	
	public static void printRL(int left,int right) {
		
		System.out.printf("L : %d, R : %d",left,right);
		System.out.println();
		
	}

	public static String LR() {

		if (hands.equals("right")) {
			return "R";
		} else {
			return "L";
		}
	}

	public static void main(String[] args) {

		int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		hands = "right";
		String[] result = new String[numbers.length];

		int right = 3;
		int left = 3;

		for (int i = 0; i < numbers.length; i++) {
			printRL(left,right);
			if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) { // ���� ���ڰ� ������, left���� ����Ǿ�� �Ѵ�.
				result[i] = "L";
				left = (numbers[i] - 1) / 3;
			} else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) { // ���� ���ڰ� ������. right���� ����Ǿ�� �Ѵ�.
				result[i] = "R";
				right = (numbers[i] - 1) / 3;
			} else if (numbers[i] == 2 || numbers[i] == 5 || numbers[i] == 8 || numbers[i] == 0) { //1.��� ���ڰ� ������,

				if (numbers[i] == 0) {								//2.�ϴ� �ش� ���ڰ� 0�̸� right�� left�� ���ڰ� ���� ���� ������ �����Ѵ�.
					if (right > left) {
						result[i] = "R";
						right = 3;
					} else if (left > right) {
						result[i] = "L";
						left = 3;
					} else if (left == right) {	// �� ���ڰ� ���� ��ġ�� �ִٸ� ������ Ȯ��.
						result[i] = LR();
					}

				} else {									//3. ��� ���ڰ� �������� 0�� �ƴ� 2 5 8�� ���
					if (Math.abs(right - (numbers[i] - 1) / 3) < Math.abs(left - (numbers[i] - 1) / 3)) { // inputData�� left�� right�� ���� ���밪�� ���Ѵ�.
						result[i] = "R";
						right = (numbers[i] - 1) / 3;
					} else if (Math.abs(right - (numbers[i] - 1) / 3) > Math.abs(left - (numbers[i] - 1) / 3)) {
						result[i] = "L";
						left = (numbers[i] - 1) / 3;
					} else {
						result[i] = LR();
						if(hands.equals("right")) {
							right = (numbers[i]-1)/3;
						}else if(hands.equals("left")) {
							left = (numbers[i]-1)/3;
						}
					}
				}

			}
		}

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}

	}

}
