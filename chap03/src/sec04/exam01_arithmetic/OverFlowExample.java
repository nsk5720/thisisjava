package sec04.exam01_arithmetic;

public class OverFlowExample {

	public static void main(String[] args) {
		/*
		 * int x = 1000000;             int�� �������� �Ѿ �����Ⱚ�� ����
		 * int y = 1000000;             �׷��� �� ���� �������� ���� long���� ����ؾ���
		 * int z = x * y;
		 * system.out.printl(z)
		 */

		long x = 1000000;
		long y = 1000000;
		long z = x * y;
		System.out.println(z);
	}

}
