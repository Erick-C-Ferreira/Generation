/*
 * Exercicio 7
 Receber valores de base e altura de um triângulo e verificar se são valores válidos
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
 */

programa
{
	
	funcao inicio()
	{
		real base, altura, area
		
		escreva ("Informe o tamabanho da Base ")
		leia (base)
		escreva ("Informe o tamanho da Altura ")
		leia (altura)

		se (base > 0 e altura > 0) {
			// formula
			area = (base * altura) / 2
			escreva ("A area do triangulo é de: " + area)
			// escreva("A aréa do triangulo é de: " + ((base * altura) / 2))
		} senao {
			escreva ("Numero informado é valido")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 352; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */