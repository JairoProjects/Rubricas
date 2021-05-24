package es.salesianos.rubicas.eedd.es.salesianos.rubricas.eedd;

public class CuentaVocalesYConsonantesEnUnaPalabra {

	String word = "Animal";
	cuentaVocales(word);
	cuentaConsonantes(word);

	public int cuentaVocales(String word) {
		int contador = 0;
		for (int x=0; x<word.length(); x++){
			if ((word.charAt(x)=='a') || (word.charAt(x)=='e') || (word.charAt(x)=='i') || (word.charAt(x)=='o') || (word.charAt(x)=='u') || (word.charAt(x)=='A') || (word.charAt(x)=='E') || (word.charAt(x)=='I') || (word.charAt(x)=='O') || (word.charAt(x)=='U'))
				contador++;
		}
		return contador;
	}

	public int cuentaConsonantes(String word) {
		int contador = 0;
		for (int x=0; x<word.length(); x++){
			if ((word.charAt(x)!='a') || (word.charAt(x)!='e') || (word.charAt(x)!='i') || (word.charAt(x)!='o') || (word.charAt(x)!='u') || (word.charAt(x)!='A') || (word.charAt(x)!='E') || (word.charAt(x)!='I') || (word.charAt(x)!='O') || (word.charAt(x)!='U'))
				contador++;
		}
		return contador;
	}
}
