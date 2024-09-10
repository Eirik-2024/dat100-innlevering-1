package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O3 {
	public static void main(String[] args) {
		// Lag et program som leser inn et heltall n > 0, 
		//beregner verdien n! (n fakultet) og skriver verdien til n! ut på skjermen, der n! = 1*2*3* … *(n-1)*n.

		String heltalltxt = showInputDialog("Skriv et heltall");
		int heltall = parseInt(heltalltxt); 
		
		int n = 1;
		int resultat = 1;	
		if (heltall>0) {
			do {
			resultat = (resultat)*n;
			n++;
			}while(n<=heltall);
		}
		else {
			System.out.print("Ugyldig sum, kjør program på nytt");
		}System.out.print(resultat);
		
	}

}


