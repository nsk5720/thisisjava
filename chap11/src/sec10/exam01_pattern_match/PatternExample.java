package sec10.exam01_pattern_match;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		//white@naver.com (or) white@naver.co.kr
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w)?";		//w는 한개 이상의 문자 그리고 +@ 골뱅이가 하나 있어야 한다 그다음 문자열 그다음 닷이 있어야하고 그다음 문자열이 있어야한다. ()?는 있어도되고 없어도 되는 선택적인 부분
		data = "nsk5720@naver.com";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		//	날짜와 일반 숫자를 구분해서 데이터 베이스에 구축하기 위한 정규식 표현
		//	^\\d{4}-\\d{2}-\\d{2}&			^=시작	$=끝
	}

}
