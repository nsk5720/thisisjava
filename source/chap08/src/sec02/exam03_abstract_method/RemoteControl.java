package sec02.exam03_abstract_method;

public interface RemoteControl {
	//��� �ʵ�
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ�                     {} ���డ�� ���̸� ����  �������̽��� 
	void turnOn();
	void turnOff();
	void setVolume(int volume);        //void �տ� defalut �����ָ� {} ��� ����
}
