package sec08.exam01_method_declaration;

public class Calculator {
	//�޼ҵ�       ���ϰ��� ���� ���� �ְ� ���� ���� ���� ���� ���ϰ������� void �ٿ�����      �����ڴ� ���ϰ��� ���� ����
	void powerOn() {                              //���ϰ������� void
		System.out.println("������ �մϴ�.");
	}
	
	int plus(int x, int y) {          //��Ʈ�� �޴´ٰ� �ϰ� ���ϰ������� �����Ͽ���
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
}
