package calculadora;

public class Calculadora {
	private int[] numbers;
	private int operadores = 0;
	private IOperations operations;
	
	public void enter(int i) {
		numbers[this.operadores] = i;
		this.operadores++;
	}

	public void reset() {
		numbers = null;
		operadores = 0;		
	}
	
	public int[] apply(){
		return numbers;
	}

	public void result( ) {
		// TODO Auto-generated method stub
		
	}

}
