package test09;

public class Child extends Parent{
	private String name;
	
	public Child() {
		//super();			//��1�������� �� �ڵ� ������ (���۴� �θ� ȣ��) but this()������ ������� ����
		this("ȫ�浿");		//��2�����ڰ� �ϳ��� �Ʒ� �޼ҵ� child(String name)�� �����
		System.out.println("Child() call");
	}
	
	public Child(String name) {		//��3���� ������(�Ķ���Ͱ� �ϳ���...)super()�� ȣ�� 
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
