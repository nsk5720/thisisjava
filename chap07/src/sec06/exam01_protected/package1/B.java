package sec06.exam01_protected.package1;

public class B {
	public void method() {
		A a = new A();			//A��� Ŭ�����ȿ��� a��� ��ü ����
		a.field = "value";		//a��� �ʵ尪�� ������ �������
		a.method();				//�޼ҵ嵵 ���   => 3���� ��� ���� ���� ��Ű�� �ȿ� �ִ� �ڽ��̶�
	}
}
