
public class Dice {
	private int randomnum;
	
	public int Throw(){
		randomnum += 1 + (int) (Math.random()*6);
		return randomnum;

}
}