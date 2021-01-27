/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. */

package ProjetoJava;

import java.util.Scanner;

public class Idade {
	
	public static void main(String args[])
	{
		int dias,anos,meses;
		
		Scanner ler = new Scanner(System.in);
		
			System.out.println("Olá, informe sua idade em dias: ");
			dias = ler.nextInt();
			
			anos=dias/365;
			meses=(dias%365)/30;
			dias=(dias%365)%30;
					
					
			System.out.printf("Você tem "+anos+" anos "+meses+" meses e "+dias+" dias");
	}
		
}
