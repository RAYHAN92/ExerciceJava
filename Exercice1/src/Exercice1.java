
//Ceci importe la classe Scanner du package java.util
import java.util.Scanner; 
//Ceci importe toutes les classes du package java.util
import java.util.*;
public class Exercice1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le premier entier  :");
		int pIMin = sc.nextInt();
		System.out.println("Veuillez saisir le deuxieme entier  :");
		int pIMax = sc.nextInt();
		displayMagicNumber(pIMin,pIMax);
		if(pIMin>pIMax){
			throw new IllegalArgumentException("la deuxieme valeur doit etre superieure a la premiere");
		}
		if(pIMin==pIMax){
			throw new IllegalArgumentException("la deuxieme valeur doit etre superieure a la premiere");
		}
	}
	public static void displayMagicNumber(int plMin, int plMax) {
		int i = plMin;
		while(i++<plMax-1) {
			if(i%3==0) {
				System.out.println("H");
			}else if(i%5==0) {
				System.out.println("S");
				
			}else {
				System.out.println(i);

			}
		}
	}
	
}
