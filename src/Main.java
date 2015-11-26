
public class Main {

	public static void main(String[] args) {
		
		ThreeDice dice = new ThreeDice();
		ThreeDice play = new ThreeDice();
		
		int iresult = dice.Throw();
		String sresult = play.toString(iresult);
		
	
		
		System.out.println("Throwing three dices: " + iresult);
		System.out.println("dice string : "+ sresult);
		
		
	}

}
