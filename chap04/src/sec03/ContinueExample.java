package sec03;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) {               //�������� 0�� �ƴϴ� = Ȧ���� �����ϰ� ����   // �������� 1�� �ƴϴ� = ¦���� �����ϰ� ����
				continue;
			}
			System.out.println(i);
		}

	}

}
