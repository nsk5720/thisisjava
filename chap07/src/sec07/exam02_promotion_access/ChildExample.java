package sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		Child child1 = new Child();			//�� ���п� 15���� ȣ�� ����
		Parent parent = child;
		
		parent.method1();
		
		parent.method2();                      //@override ������̼Ƕ����� child�� ����� (=�� �а� �߰������� �д� ���� ������̼��̶�?)
		
		//parent.method3(); (ȣ�� �Ұ���)			//����ȯ�ؼ� ȣ�� �Ұ���
		child1.method3();  //(ȣ�� �԰���)			//child1 ��ü�� �� ������༭
	}

}
