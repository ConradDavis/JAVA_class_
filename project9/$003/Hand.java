package $003;

public enum Hand {
	STONE,PAPER,SCISSORS;
	
	public String toString() {
		switch(this) {
		case STONE:return "Ê¯Í·";
		case PAPER:return "²¼";
		case SCISSORS:return "¼ôµ¶";
		default:return "NONE";
		}
	}
}
