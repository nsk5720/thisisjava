package sec02.exam05_static_method;

public interface RemoteControl {           //�������̽� = Tv ���� �����ܰ��� ���� �������̽��� ��Ī�� ���� ������ ������ ���� ���� �ƴ�
	//��� �ʵ�
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ�                     {} ���డ�� ���̸� ����  �������̽��� 
	void turnOn();
	void turnOff();
	void setVolume(int volume);     
	
	//����Ʈ �޼ҵ�
	default void setMute(boolean mute) {          //default�� ������ ���೻���� ���� ����
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	//���� �޼ҵ�
	static void changesBattery() {
		System.out.println("�������� ��ȯ�մϴ�");
	}
}
