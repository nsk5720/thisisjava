package sec11.exam01_final;

public class PersonExample {

	public static void main(String[] args) {                   //final�� ��ü���� �������� static�� Ŭ���� ��ü�� ����
		Person p1 = new Person("123456-1234567", "���");
		Person p2 = new Person("901109-1234567", "��������");     //��ü���� �����̱� ������ �̷��� �ٲٴ°��� ������.
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";
		//p1.ssn = "654321-7654321";
		p1.name = "��������";
	}

}