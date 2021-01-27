/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e 
escreva o custo ao consumidor. */

package ProjetoJava;

import java.util.Scanner;

public class CustoCarro {

			
	public static void main (String args[]) {
		
		double CustoFabrica, t, CustoTotal;
		
		Scanner ler = new Scanner(System.in);
				
		System.out.println("Digite o custo de fábrica do carro: ");
		CustoFabrica = ler.nextFloat();
		
		t = 0.28 + 0.45;
		CustoTotal = CustoFabrica+(CustoFabrica*t);
		
		System.out.printf("O custo do consumidor será de R$%2.2f",CustoTotal);
		
	}
}
