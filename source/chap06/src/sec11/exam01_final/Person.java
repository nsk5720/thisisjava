package sec11.exam01_final;

public class Person {   //static �� ���뺯�� ���
	// �ϳ��� ������ �����ϸ� static�� ��������� ��ü�� �������� �ٲ� �� ����(��ü���� ����) //String�� ���ʿ� �ڹٿ��� ���� ���� Ÿ���̶� ó���� �빮�� int�� double���� �ٸ���
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
