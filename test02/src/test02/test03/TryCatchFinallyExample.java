package test02.test03;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		String[] strArray = { "10", "2a" };
		int value = 0;
		for(int i=0; i<=2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("�ε����� �ʰ�����");
			} catch(NumberFormatException e) {
				System.out.println("���ڷ� ��ȯ�� �� ���� ");
			} finally {
				System.out.println(value);
			}
		}
	}
}
//� ������ ��ġ����
//finally�� ������ �����ϴ���
// value������ 10�� ��� ����Ǿ� �ִ���

