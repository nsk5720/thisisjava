package sec05.exam01_string_equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strvar1 = "�����";
		String strvar2 = "�����";		
		if(strvar1 == strvar2) {
			System.out.println("strvar1�� strvar2�� ������ ����");
		} else {
			System.out.println("strvar1�� strvar2�� ������ �ٸ�");
		}
		if(strvar1.equals(strvar2)) {
			System.out.println("strvar1�� strvar2�� ���ڿ��� ����");
		}
		String strvar3 = new String("�����");
		String strvar4 = new String("�����");
		if(strvar3 == strvar4) {                                     //�����δ� ���� ����Ǹ� ?? �޸��ּҴ� �ٸ��� ����//
			System.out.println("strvar3�� strvar4�� ������ ����");
		} else {
			System.out.println("strvar3�� strvar4�� ������ �ٸ�");
		}
		if(strvar3.equals(strvar4)) {
			System.out.println("strvar3�� strvar4�� ���ڿ��� ����");
		}
	}
}
