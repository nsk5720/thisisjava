package sec08.exam01_split_stringtokenizer;

public class StringSplitExample {

	public static void main(String[] args) {
		String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ";
		String[] names = text.split("&|,|-");
		
		for(String name : names) {				/*�迭�̸� : �迭(����)*/
			System.out.println(name);
		}

	}

}
