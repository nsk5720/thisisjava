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

i가 0일때 value값으로 배열의 첫번째 값인 10이 출력됨
i가 1일때 2a는 텍스트가 섞여있으므로 NumberFormatException 에러에 걸려 :숫자로 변환~이 출력되고 finally는 무조건적으로 실행되므로 10이 또 출력됨
i가 2일때 배열의 세번째 값이 없으므로 ~에러에 걸려 ~이 출력되고 마찬가지로 finally이 실행되어 10이 출력됨
정리하면, 출력은 10 10 10이 출력됨