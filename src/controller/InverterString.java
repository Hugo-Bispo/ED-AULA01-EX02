/*
a- A condi��o de parada ocorre quando o valor de �qtd� � igual a 0.
b- Para chegar ao resultado do texto invertido utilizando a fun��o de �subtring�
 precisamos obter a �ltima posi��o do caractere da vari�vel �texto�. Atrav�s do 
 �length� � poss�vel obter esse valor e definir o range em que a fun��o �subtring� 
 ir� trabalhar, no processo de decrementar o valor de �qtd� em cada itera��o do 
 programa o mesmo armazena em "texto" e passa para o novo valor de �qtd�. 
 Com isso, exibe o valor final e ao chegar no valor = 0 ele entra para condi��o 
 de parada.

 */
package controller;

public class InverterString {
	public String inversor (String texto, int qtd) {
		if (qtd == 0) {
			return "";
		}
		else {
			return texto.substring(qtd - 1, qtd) + inversor(texto, qtd - 1);
		}
	}
}