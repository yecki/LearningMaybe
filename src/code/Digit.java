package code;

public class Digit {
	private int value = 0;
	private int probable = 50;
	
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getProbable() {
		return probable;
	}
	public void increaseProbable() {
		probable+=10;
	}
	public void increaseProbableBy(int by) {
		probable+=by;
	}
	public void decreaseProbable() {
		probable--;
	}

	
	
}
