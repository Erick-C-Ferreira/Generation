
// Exercicio 5
// Fa�a um sistema que leia as 3 notas de um aluno e 
// calcule a m�dia final deste aluno. 
// Considerar que a m�dia � ponderada e 
// que o peso das notas �: 2,3 e 5, respectivamente. 

package applicaticon;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1, nota2, nota3, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a nota 1�: ");
		nota1 = leia.nextFloat();
		System.out.println("Entre com a nota 2�: ");
		nota2 = leia.nextFloat();
		System.out.println("Entre com a nota 3�: ");
		nota3 = leia.nextFloat();
			
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
				//media = nota1+nota1 + nota2+nota2+nota2 + nota3+nota3+nota3+nota3+nota3
		System.out.println("Sua m�dia �: "+media);
		
		leia.close();		

	}

}
