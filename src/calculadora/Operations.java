package calculadora;

public class Operations implements IOperations {

	@Override
	public int add(int[] numeros) {
		// TODO Auto-generated method stub
		int i, suma = 0;
		for(i = 0; i <= numeros.length; i++){
			suma =+ numeros[i];
		}
		return suma;
	}

	@Override
	public void minus() {
		// TODO Auto-generated method stub

	}

	@Override
	public void mult() {
		// TODO Auto-generated method stub

	}

	@Override
	public void div() {
		// TODO Auto-generated method stub

	}

}
