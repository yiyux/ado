package calculadora;

public class Calculadora {
	private int number;
	
	public void enter(int i) {
		number = i;		
	}

	public void add(int i) {
		number += i;		
	}

	public Object result() {
		return number;
	}

}
