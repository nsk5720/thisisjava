package sec05.exam01_anonymous_extends;

public class Anonymous {
	Person field = new Person() {
		void work() {
			System.out.println("����մϴ�.");
		}
		
		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
		
	};
	
	void method1() {               //�޼ҵ�ȿ� �ʵ带 �����ϸ� �ʵ尡 �ƴ϶� ������ ��  //�޼ҵ� �ȿ� ����� �ʵ�� '����'��� ��
		 //�͸��� ��ü�� ������ �޼ҵ忡�� ��� // 16~25���� ����!	//�͸��� ��ü�� ������ �޼ҵ忡�� ����ϴ� ������ �����ʴϴ�.
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}
			
			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
			
		};
		// ���ú����� ����ϰ� �ִ� ����
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}