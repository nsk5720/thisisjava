package sec04.exam04_local_variable;

public class UsingLocalVariable {
	void method(int arg) {			//��������(���๮�� 20)
		int localVar = 40;			//��������
		
		MyFunctionalInterface fi = () -> {
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar + "\n");
		};
		fi.method();
	}
}
