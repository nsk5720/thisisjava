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

//����Ŭ������ IntegerŬ������ -128~127�� ���ڸ� �ε�ȣ 2���� ���ο� ���� ���� �� �ִ�. 
//100�� �����ȿ� ���Ե����� �ε�ȣ 2���� ���Ͽ� true�� ��µ�
//300�� �����ȿ� ���Ե��� �����Ƿ� �ε�ȣ 2���� ���� �� ������ �������̵� �� equals �޼ҵ带 ����Ͽ� ���Ͽ��� ��.