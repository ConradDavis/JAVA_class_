package $003;

public enum Hand {
	STONE,PAPER,SCISSORS;
	
	public String toString() {
		switch(this) {
		case STONE:return "ʯͷ";
		case PAPER:return "��";
		case SCISSORS:return "����";
		default:return "NONE";
		}
	}
}
