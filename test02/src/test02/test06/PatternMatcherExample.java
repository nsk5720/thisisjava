package test02.test06;

import java.util.regex.Pattern;

public class PatternMatcherExample {

	public static void main(String[] args) {
		String id = "5Angel1004";
		String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
		} else {
			System.out.println("ID로 사용할 수 없습니다.");
		}
	}
}

//{}는 바로 앞에있는 []의 범위를 지정해줌 {7,11}은 바로 앞의 [a-zA-Z0-9]의 범위만 지정해줌



