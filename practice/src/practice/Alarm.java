package practice;

import java.util.Scanner;

public class Alarm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �˶� ���߱� 45�� ������ //
		int h = 0;
		int m = 0;
		
		h = sc.nextInt();
		m = sc.nextInt();
		/*System.out.println(h + "�� " + m + "��"); */
		          // 23 59
			if(m<45) {
				h = h - 1;
				m = 60 - (45 - m);
				if(h<0) {
				h = 23;	
				}
				System.out.println(h + " " + m);
			}
			else {
				m = m - 45;
				System.out.println(h + " " + m);
			}
								
	}

}
