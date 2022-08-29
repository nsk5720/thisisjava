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

i�� 0�϶� value������ �迭�� ù��° ���� 10�� ��µ�
i�� 1�϶� 2a�� �ؽ�Ʈ�� ���������Ƿ� NumberFormatException ������ �ɷ� :���ڷ� ��ȯ~�� ��µǰ� finally�� ������������ ����ǹǷ� 10�� �� ��µ�
i�� 2�϶� �迭�� ����° ���� �����Ƿ� ~������ �ɷ� ~�� ��µǰ� ���������� finally�� ����Ǿ� 10�� ��µ�
�����ϸ�, ����� 10 10 10�� ��µ�