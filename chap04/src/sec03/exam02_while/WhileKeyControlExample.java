package sec03.exam02_while;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keycode = 0;
		
		while(run) {
			if(keycode!=13 && keycode!=10) {
				System.out.println("--------------------");
				System.out.println("1.���� | 2.���� | 3.���� ");
				System.out.println("--------------------");	
				System.out.println("����: ");
			}
			
			keycode= System.in.read();
			
			if (keycode == 49) { //1
				speed++;
				System.out.println("���� �ӵ�=" + speed);
			} else if (keycode == 50) { //2
				speed--;
				System.out.println("���� �ӵ�=" + speed);
			} else if (keycode == 51) { //3
				run = false;
			}
			
		}
		
		System.out.println("���α׷� ����");
		}
	}
