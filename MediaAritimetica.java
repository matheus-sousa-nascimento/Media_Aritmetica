/*
 * MediaAritimetica.java
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class MediaAritimetica {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double nota1 = 0;
		double nota2 = 0;
		double notaT = 0;
		
		System.out.println("Digite a sua primeira nota");
		nota1 = entrada.nextInt();
		
		System.out.println("Digite a sua segunda nota");
		nota2 = entrada.nextInt();
		
		notaT = (nota1 + nota2) / 2;
		
		String res = (notaT >= 6 ? "APROVADO, SUA MEDIA FOI DE " + notaT :"REPROVADO, SUA MEDIA FOI DE " + notaT);
		
		System.out.print(res);
	}
}

