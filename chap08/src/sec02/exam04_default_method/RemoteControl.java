package sec02.exam04_default_method;

import javax.swing.plaf.basic.DefaultMenuLayout;

public interface RemoteControl {
	//��� �ʵ�
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ�                     {} ���డ�� ���̸� ����  �������̽��� 
	void turnOn();
	void turnOff();
	void setVolume(int volume);     
	
	default void setMute(boolean mute) {          //default�� ������ ���೻���� ���� ����
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}
}
