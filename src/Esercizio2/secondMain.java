package Esercizio2;

public class secondMain {
	public static void main(String[] args) {
		between0and3(2);
	}
	
	static void between0and3(int n) {
		String x = Conversione(n);
		switch (n) {
		case 1 : {
			System.out.println("il numero è " + x);
			break;
		} 
		case 2 : {
			System.out.println("il numero è " + x);
			break;
		}
		default : 
			System.out.println("Error message");
		}
	}
	
	static String Conversione (int n) {
		if(n == 1) {
			String one = "uno";
			return one;
		}else if (n == 2) {
			String two = "due";
			return two;
		}else {
			String error = "error message";
			return error;
		}
	}
}
