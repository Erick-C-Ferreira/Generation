package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Usuario usuario = new Usuario();

		Scanner leia = new Scanner(System.in);

		float imIcms = 0, cosip = 12.94f, imPis, imCofins, icmsUso, icmsEnergia, icmsCofins, icmsPis, valorConta = 0;
		int op = 0, kwh = 0;

		System.out.println("----------Sistema de calculo dos impostos na conta de luz----------\n");
		System.out.print("----------Obs: Para facilitar o uso, separe os itens abaixo----------\n");
		System.out.println(
				"\t\tTenha em m�os o RG/CPF ou CNH;\n\t\tPegue uma conta de Luz;\n\t\tEm sua Conta localize o seu CEP e o valor consumido de Kwh\n");

		try {
			System.out.println("Nome Completo: ");
			usuario.nome = leia.nextLine();
			System.out.println("Insira seu email para receber notifica��es sobre novos calculos de impostos: ");
			usuario.email = leia.nextLine();
			System.out.println("Valor da conta(use virgula): ");
			valorConta = leia.nextFloat();
			System.out.println("KWH gastos no m�s: ");
			System.out.println("----Selecione a Bandeira atual Referente ao seu Municipio----");
			System.out.println("\t1-Bandeira Verde\n\t2-Bandeira Amarela\n\t3-Bandeira Vermelha 1");
			System.out.print("\t4-Bandeira Vermelha 2\n\t5-Bandeira de Escassez H�drica");
			System.out.print("\nDigite sua op��o: ");
			op = leia.nextInt();
		}

		catch (InputMismatchException e) {
			System.out.println(
					"\nVoc� inseriu uma letra ao inv�s de numero ou um numero com ponto ao inv�s de virgula!!!");
			return;
		}

		imPis = (float) (valorConta * 0.006);
		imCofins = (float) (valorConta * 0.03);

		if ((kwh >= 91) && (kwh <= 200)) {
			icmsUso = (float) ((kwh * 0.4940) * 0.12);
			icmsEnergia = (float) ((kwh * 0.38313) * 0.12);
			icmsPis = kwh * 0.006f;
			icmsCofins = kwh * 0.03f;
			imIcms = icmsUso + icmsEnergia;
		}
		if (kwh > 200) {
			icmsUso = (float) ((kwh * 0.4940) * 0.25);
			icmsEnergia = (float) ((kwh * 0.38313) * 0.25);
			icmsPis = kwh * 0.006f;
			icmsCofins = kwh * 0.03f;
			imIcms = icmsUso + icmsEnergia + icmsPis + icmsCofins;
		}
		if (op < 6) {
			System.out.println("\n------------------Conta Detalhada------------------");
			System.out.printf("\nTUSD(Tarifa de Utiliza��o de Servi�os de Distribui��o): R$%.2f", (0.40940f * kwh));
			System.out.printf("\nTE(Tarifa de energia: R$%.2f", (0.38313f * kwh));
			System.out.println("");
			System.out.println("\nOs impostos na sua conta s�o: ");
			System.out.printf("\nPis/Pasep: RS$%.2f", imPis);
			System.out.printf("\nConfins: R$%.2f", imCofins);
			System.out.printf("\nCosip: R$%.2f", cosip);
		} else {
			System.out.println("\nNumero inserido � invalido!!!");
		}
		switch (op) {
		case 1:
			if (kwh <= 90) {
				System.out.printf("\nPor voc� ter consumido menos de 90 kwh, n�o e cobrado a taxa de ICMS");
				System.out.println("\nNa bandeira verde n�o e cobrado nenhuma taxa adicional!!");
				System.out.printf("\nO valor total de impostos na sua conta �: R$%.2f", (imPis + imCofins + cosip));
				System.out.printf("\nO total de impostos e de: R$%.2f", (imPis + imCofins + cosip));
				System.out.printf("\nO valor total da conta sem impostos e de: R$%.2f",
						valorConta - (imPis + imCofins + cosip + imIcms));
			} else {
				System.out.printf("\nICMS: R$%.2f", imIcms);
				System.out.println("\nNa bandeira verde n�o e cobrado nenhuma taxa adicional!!");
				System.out.printf("\nO total de impostos e de: R$%.2f", (imPis + imCofins + cosip + imIcms));
				System.out.printf("\nO valor total da conta sem impostos e de: R$%.2f",
						valorConta - (imPis + imCofins + cosip + imIcms));
			}
			break;
		case 2:
			if (kwh <= 90) {
				System.out.printf("\nPor voc� ter consumido menos de 90 kwh, n�o e cobrado a taxa de ICMS");
				System.out.printf("\nAdicional bandeira amarela: R$%.2f", (valorConta * 0.01874f));
				System.out.printf("\nO total de impostos e de: R$%.2f", (imPis + imCofins + cosip));
				System.out.printf("\nO valor total da conta sem impostos e de: R$%.2f",
						valorConta - (imPis + imCofins + cosip + imIcms));
			} else {

				System.out.printf("\nICMS: R$%.2f", (imIcms));
				System.out.printf("\nAdicional bandeira amarela: R$%.2f", (valorConta * 0.01874f));
				System.out.printf("\nO valor total de impostos na sua conta �: R$%.2f",
						(imPis + imCofins + cosip + imIcms));
				System.out.printf("\nO valor total da conta sem impostos e de: R$%.2f",
						valorConta - (imPis + imCofins + cosip + imIcms));
			}
			break;
		case 3:
			if (kwh <= 90) {
				System.out.printf("\nPor voc� ter consumido menos de 90 kwh, n�o e cobrado a taxa de ICMS");
				System.out.printf("\nAdicional bandeira vermelha patamar 1: R$%.2f", (valorConta * 0.03971f));
				System.out.printf("\nO valor total de impostos na sua conta �: R$%.2f", (imPis + imCofins + cosip));
				System.out.printf("\nO valor total da conta sem impostos e de: R$%.2f",
						valorConta - (imPis + imCofins + cosip + imIcms));
			} else {
				System.out.printf("\nICMS: R$%.2f", (imIcms));
				System.out.printf("\nAdicional bandeira vermelha patamar 1: R$%.2f", (valorConta * 0.03971f));
				System.out.printf("\nO valor total de impostos na sua conta �: R$%.2f",
						(imPis + imCofins + cosip + imIcms));
				System.out.printf("\nO valor total da conta sem impostos e de: R$%.2f",
						valorConta - (imPis + imCofins + cosip + imIcms));
			}
			break;
		case 4:
			if (kwh <= 90) {
				System.out.printf("\nPor voc� ter consumido menos de 90 kwh, n�o e cobrado a taxa de ICMS");
				System.out.printf("\nAdicional bandeira vermelha patamar 2: R$%.2F", (valorConta * 0.09492f));
				System.out.printf("\nO valor total de impostos na sua conta �: R$%.2f", (imPis + imCofins + cosip));
				System.out.printf("\nO valor total da conta sem impostos e de: R$%.2f",
						valorConta - (imPis + imCofins + cosip + imIcms));
			} else {
				System.out.printf("\nICMS: R$%.2f", (imIcms));
				System.out.printf("\nAdicional bandeira vermelha patamar 2: R$%.2f", (valorConta * 0.09492f));
				System.out.printf("\nO valor total de impostos na sua conta �: R$%.2f",
						(imPis + imCofins + cosip + imIcms));
				System.out.printf("\nO valor total da conta sem impostos e de: R$%.2f",
						valorConta - (imPis + imCofins + cosip + imIcms));
			}
			break;
		case 5:
			if (kwh <= 90) {
				System.out.printf("\nPor voc� ter consumido menos de 90 kwh, n�o e cobrado a taxa de ICMS");
				System.out.printf("\nAdicional bandeira escassez h�drica: R$%.2f", valorConta * 0.1748);
				System.out.printf("\nO valor total de impostos na sua conta �: R$%.2f", (imPis + imCofins + cosip));
				System.out.printf("\nO valor total da conta sem impostos e de: R$%.2f",
						valorConta - (imPis + imCofins + cosip + imIcms));
			} else {
				System.out.printf("\nICMS: R$ %.2f", (imIcms));
				System.out.printf("\nAdicional bandeira escassez h�drica: R$%.2f", valorConta * 0.1748);
				System.out.printf("\nO valor total de impostos na sua conta �: R$%.2f",
						(imPis + imCofins + cosip + imIcms));
				System.out.printf("\nO valor total da conta sem impostos e de: R$%.2f",
						valorConta - (imPis + imCofins + cosip + imIcms));
			}
			break;
		}

	}
}