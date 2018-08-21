package code;

public class Logic {
	
	private int runs = 10000;
	private String goal = "4123749";
	
	private Digit[] curNumber = new Digit[goal.length()];
	
	public void run() {
		for (int index=0; index < curNumber.length; index++) {
			curNumber[index] = new Digit();
		}
		for (int curRun = 0; curRun < runs; curRun++) {
			for (int index=0; index < curNumber.length; index++) {
				//skips the digit if it is already correct
			if (curNumber[index].getProbable() >= 100) continue;
				//checks whether the digit "wants" to change
			if (!(((int)(Math.random()*100) + 1) <= curNumber[index].getProbable() )) {
				
				curNumber[index].setValue((int) (Math.random()*10));
			}
				
				if (goal.substring(index, index+1).equals(""+curNumber[index].getValue())) {
					curNumber[index].increaseProbable();
				}else {
					curNumber[index].decreaseProbable();
				}
			if(curNumber[index].getProbable() >= 100) System.out.println("true " + (index + 1) + " on run: " + (curRun + 1));
				
			}
		}
		for (int index=0; index < curNumber.length; index++) {
			System.out.print(curNumber[index].getValue());
		}
		
	}
	
}
