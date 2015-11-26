public class ThreeDice {
	private int randomnum;
	private int result;
	
	public int D1(){
		randomnum += 1 + (int) (Math.random()*6);
		return randomnum;
	}
	public int D2(){
		randomnum += 1 + (int) (Math.random()*6);
		return randomnum;
	}
	public int D3(){
		randomnum += 1 + (int) (Math.random()*6);
		return randomnum;
	}
	
	public int Throw(){
		result = (D1()+ D2()+ D3())/3;
		return result;
	}
		
}

