package sec14_exam01_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM월 dd일 yyyy년 hh시 mm분 ss초");	/*월은 m이 대문자 분보다 크니께*/
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}

}
