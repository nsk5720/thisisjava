package sec06_throws;			//�ǹ����� ����� ���ɼ��� ����

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}

	}

	public static void findClass() throws ClassNotFoundException{  //throws ClassNotFoundException <- ���� ���ѱ��(����)
		Class clazz = Class.forName("java.lang.string2");			// throws Class~ ���ָ� ���� �߻�
	}
}



