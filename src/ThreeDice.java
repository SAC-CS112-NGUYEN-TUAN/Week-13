public class ThreeDice {
	
	private int result;
	
	public int Throw(){
		Dice D1 = new Dice();
		Dice D2 = new Dice();
		Dice D3 = new Dice();
		
		result = (D1.Throw() + D2.Throw()+ D3.Throw())/3;
		return result;
	}
		
}

