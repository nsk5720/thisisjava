package sec12.exam01_wrapper;

public class ValueCompareExample {

	public static void main(String[] args) {
		System.out.println("[-128~127 �ʱⰪ�� ���]");
		Integer obj1 = 300;		//127�� �ΰ��� �ٲٸ� true����			����
		Integer obj2 = 300;
		System.out.println("==���: " + (obj1 == obj2));
		System.out.println("��ڽ��� ==���: " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals() ���: " + obj1.equals(obj2));

		System.out.println("=========================================");
		
		System.out.println("[-128~127 �ʱⰪ�� ���]");
		Integer obj3 = 127;										// 	������(�̻��� ��)
		Integer obj4 = 127;
		System.out.println("==���: " + (obj3 == obj4));
		System.out.println("��ڽ��� ==���: " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() ���: " + obj3.equals(obj4));
	}

}
