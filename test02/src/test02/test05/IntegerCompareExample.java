package test02.test05;

public class IntegerCompareExample {

	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		System.out.println( obj1 == obj2 );
		System.out.println( obj3 == obj4 );
	}
}


// ����Ŭ���� IntegerŬ������ -128~127������ ���ڴ� ��ȣ 2���� ���ο� ���� ���� �� �ִ�
// ���� 100�� �����ȿ� �ش��ϱ⶧���� true���� ��ȯ�ϰ� 300�� �����ȿ� �ش����� �ʱ� ������ ��ȣ 2���� ���� �� ����
// ����Ŭ������ ���ΰ��� �������� �������̵��� equals�޼ҵ�� ���Ͽ��� �Ѵ�.