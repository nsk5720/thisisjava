package sec01.exam01_variable;

public class variableScopeExample3 {

	public static void main(String[] args) {
		int v1 = 20;
			if(v1>10) {
				int v2 = v1 - 5;
			}
			
		int v3 = v1 + v1 + 10;
		System.out.println(v3);

	}

}
