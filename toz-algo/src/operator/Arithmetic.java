package operator;

public class Arithmetic {
	public String calc(int a,String op, int b){
		String result = "";
		switch (op) {
		case "+":
			result = a +"+"+ b+" = " + (a + b);
			break;

		default:
			break;
		}

		return result;
	}
}
