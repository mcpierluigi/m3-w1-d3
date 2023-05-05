package Esercizio1;

public class firstMain {
	
	public static void main(String[] args) {
		
		String x = "Pierluigi";
		int y = 2024;
		
		stringaPariDispari(x);
		annoBisestile(y);
	}
	
	static void stringaPariDispari(String stringa) {
		if(stringa.length() % 2 == 0) {
			System.out.println("Il numero di caratteri è pari");
		} else {
			System.out.println("Il numero di caratteri è dispari");
		}
	}
	
	static void annoBisestile(int anno) {
		if(anno % 4 == 0) {
			System.out.println("L'anno è bisestile");
		} else if (anno % 100 == 0 && anno % 400 == 0) {
			System.out.println("L'anno è bisestile");
		} else {
			System.out.println("L'anno non è bisestile");
		}
	}
}