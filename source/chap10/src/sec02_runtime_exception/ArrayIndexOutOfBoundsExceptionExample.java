package sec02_runtime_exception;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		// 10 20      //10       //10 a20
		
		if(args.length==2) {	
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0]: "+ data1);
			System.out.println("args[1]: "+ data2);
		} else {
			System.out.println("[실행방법]");
			System.out.println("ArrayIndexOutOfBoundsExceptionExample");
			System.out.println("값1  값2");
		}
	}

}
