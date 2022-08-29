package sec04.exam01_arithmetic;

public class CheckOverFlowExample {

	public static void main(String[] args) {
		try {
			int result = safeadd(2000000000, 2000000000);
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����");
		}
	}

	public static int safeadd(int left, int right) {
		if((right>0)) {
			if(left>(Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		} else {
			if(left<(Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		}
		return left + right;
	}
}