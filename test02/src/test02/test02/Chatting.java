package test02.test02;

public class Chatting {
		void startChat(String chatId) {
			// Chat��� ���� Ŭ�������� nickName�̶�� �ϴ� ���� ������ ����ϰ� ������ nickName�� final Ư���� ���� ������
			// �Ʒ��� �ڵ�ó�� �� �� ���� �ָ� ������ �� ����.
			String nickName = chatId;				//<=�̰� ����
			//String nickName = null;	
			//nickName = chatId;
			// �� 2 ���� String (String nickName = chatId;) �� �����ؾ��Ѵ�.
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
//nickName�� final���� ���� �Ǵµ� null���� chatId���� �ο��ؼ�?