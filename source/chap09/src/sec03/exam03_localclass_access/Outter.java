package sec03.exam03_localclass_access;

public class Outter {
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100; (x)
		//localVariable = 100; (X)
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	public void method2(int arg) {				//�ڹ� 8���� �̻� final�� ���µ� finalȿ��
		int localVariable = 1;
		//arg = 100; (x)
		//localVariable = 100; (X)
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}