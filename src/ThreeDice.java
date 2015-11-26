public class ThreeDice {
	
	private int result;
	private String sresult;
	
	public int Throw(){
		Dice D1 = new Dice();
		Dice D2 = new Dice();
		Dice D3 = new Dice();
		
		result = (D1.Throw() + D2.Throw()+ D3.Throw())/3;
		return result;
	}
	
	public String toString(int iresult){
		int r = iresult;
		
		if (r == 1 ){sresult = "one";
		}
				else if (r == 2){sresult = "two";
				}		
				else if (r == 3){sresult = "three";
				}
				else if (r == 4){sresult = "four";
				}
				else if (r == 5){sresult = "five";
				}
				else if (r == 6){sresult = "six";
				}
		
		return sresult;
	}
	
}
		


