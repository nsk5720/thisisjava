package sec03.exam04_break;

public class BreakOutterExample {

	public static void main(String[] args) {
		outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break outter; 
				}
			}
		}
		System.out.println("���α׷� ���� ����");
	}

}
