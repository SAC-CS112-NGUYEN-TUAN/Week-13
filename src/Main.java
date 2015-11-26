
public class Main {

	public static void main(String[] args) {
		
		ThreeDice dice = new ThreeDice();
		int play = dice.Throw();
		
		System.out.println("Throwing three dices: " + play);
		System.out.println("dice string :"+ dice.toString());
		System.out.println("dice"+dice);
		
	}

}
