package sec03.exam02_noname_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// �͸� ���� ��ü
		RemoteControl rc = new RemoteControl() {		//�������̽��� ��ü������ �Ұ����ϴ�!! �׷��� �͸� ���� ��ü���� �Ѱ���
			public void turnOn() {/*���๮*/}					//������ 
			public void turnOff() {/*���๮*/}
			public void setVolume(int volume) {/*���๮*/}
		};

	}

}
