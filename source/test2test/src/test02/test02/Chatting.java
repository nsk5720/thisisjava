package test02.test02;

public class Chatting {
		void startChat(String chatId) {
			//����Ŭ����Chat�� �� ���� ������ ���� nickName�̶�� ���ú����� ����ϸ� finalƯ���� ���� ������ �� ���� ������ ���־����
			//�׷��Ƿ� �� �κ����ִ� String nickName = chatId; �� �����ؾ� ������ �ȶ�
			
			String nickName = null;	
			nickName = chatId;
			
			Chat chat = new Chat() {
				@Override
				public void start() {
					while(true) {
						String inputData = "�ȳ��ϼ��� " ;
						String message = "[" + nickName + "] " + inputData;
						sendMessage(message);
					}
				}
			};
			chat.start();
		}
		class Chat {
			void start() {}
			void sendMessage(String message) {}
		}
	
}