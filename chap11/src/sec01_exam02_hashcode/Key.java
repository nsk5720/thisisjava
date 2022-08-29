package sec01_exam02_hashcode;

import sec01_exam01_equals.Member;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key key = (Key) obj;  //���� ���޹��� ���� �� ��ȯ
			if(this.number == key.number) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return number;
	}
}