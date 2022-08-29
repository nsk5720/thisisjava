package sec10.exam04_singleton;

public class Singleton {
	//��ü�� �ϳ� �ۿ� �������� ����.        private = �ܺο��� ���� ����  /  public = �ܺο��� ���� ����
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}                 // =������   Ŭ������ �̸��� ���� ���ϰ��� ����
	
	static Singleton getInstance() {
		return singleton;
	}
}
