package code;

public class AltLogic {
	private long runs = 10000;
	private String goal = "4123749";
	
	private Digit[] curNumber = new Digit[10];
	
	public void run() {
		for (int index=0; index < 10; index++) {
			curNumber[index] = new Digit();
			curNumber[index].setValue(index);
		}
		for (int curRun = 0; curRun < runs; curRun++) {
			for(int index = 0; index <= goal.length(); index++) {
				int randomNumber = (int)(Math.random()*10);
				curNumber[randomNumber].increaseProbableBy((int)Math.sqrt((Math.pow(Integer.getInteger(goal.substring(index, index+1)) - randomNumber,2))));
			}
		}
		
	}
}
