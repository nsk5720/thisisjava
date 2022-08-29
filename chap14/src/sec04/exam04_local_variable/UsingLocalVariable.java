package sec04.exam04_local_variable;

public class UsingLocalVariable {
	void method(int arg) {			//전역변수(실행문에 20)
		int localVar = 40;			//지역변수
		
		MyFunctionalInterface fi = () -> {
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar + "\n");
		};
		fi.method();
	}
}
