
// Exercicio 1
// Fa�a um programa que possua um vetor denominado A 
// que armazene 6 n�meros inteiros. O programa deve executar os seguintes passos: 
// (a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
// (b) Armazene em uma vari�vel inteira (simples) a 
// soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
// (c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
// (d) Mostre na tela cada valor do vetor A, um em cada linha.

package Exercicio1;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[6]; //1, 0, 5, -2, -5, 7.
		//(a)
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = 7;
		//(b)
		int soma = A[0]+A[1]+A[5];
		System.out.println("O resultado �: "+soma);
		
		A[3] = 100;
		System.out.println(A[3]);
		
		for(int i=0; i<A.length; i++) { // A fun��o .length retonar o tamanho do vetor
			System.out.println("O valor "+(i+1)+ " �: "+A[i]);
		}
		
		
		
	}

}
