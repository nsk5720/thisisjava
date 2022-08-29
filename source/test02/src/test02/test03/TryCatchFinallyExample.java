package test02.test03;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		String[] strArray = { "10", "2a" };
		int value = 0;
		for(int i=0; i<=2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음");
			} catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음 ");
			} finally {
				System.out.println(value);
			}
		}
	}
}
//어떤 에러에 거치는지
//finally는 무조건 실행하는지
// value값에는 10이 계속 저장되어 있는지

