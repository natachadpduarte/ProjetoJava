/*7. Um sistema de equa��es lineares do tipo: ax + by = c dx + ey = f, pode ser resolvido segundo mostrado abaixo : 
 x = ce - bf / ae - bd  y = af - cd / ae - bd
Escreva um sistema que l� os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. 
*/

package ProjetoJava;

import java.util.Scanner;

public class Coeficiente {
	
	public static void main (String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		float x, y, a, b, c , d, e, f;
		
		System.out.println("Ol�, entre com o primeiro n�mero: ");
		a = ler.nextFloat();
		
		System.out.println("Por favor, entre com o segundo n�mero: ");
		b = ler.nextFloat();		
		
		System.out.println("Entre com o terceiro n�mero: ");
		c = ler.nextFloat();
		
		System.out.println("Entre com o quarto n�mero: ");
		d = ler.nextFloat();
		
		System.out.println("Entre com o quinto n�mero: ");
		e = ler.nextFloat();
		
		System.out.println("Entre com o sexto n�mero: ");
		f = ler.nextFloat();
		
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.println("O valor de x � "+x+" e o valor de y "+y);
		
	}
}
