/*
 * As Informações de como os calculos são feitos foram tirados do site http://www.sintegra.gov.br/Cad_Estados/ 
 * ou https://www.sefaz.mt.gov.br/portal/Tributario/Digito_verificador/Default.php
 */
public class Calculos {
	

	public Boolean acre(String ie) {

		// Transforma a string em um array de char
		char[] array = ie.toCharArray();

		// transforma o array de char em array de int
		int[] arrayNumber = new int[array.length];

		// array de peso a ser usado
		int[] arrayWeight = new int[array.length];
		arrayWeight[0] = 5;
		arrayWeight[1] = 4;
		arrayWeight[2] = 3;
		arrayWeight[3] = 2;
		arrayWeight[4] = 9;
		arrayWeight[5] = 8;
		arrayWeight[6] = 7;
		arrayWeight[7] = 6;
		arrayWeight[8] = 5;
		arrayWeight[9] = 4;
		arrayWeight[10] = 3;
		arrayWeight[11] = 2;

		int cont = 0;
		int sum = 0, sum2 = 0;
		int size = ie.length();

		// converte o char em int
		for (char c : array) {
			int x = c - '0';
			arrayNumber[cont] = x;
			cont++;
		}

		// valída a obrigatoriedade dos números começarem com 01
		if (arrayNumber[0] != 0 || arrayNumber[1] != 1) {
			throw new Error("O numero deve começar com 01");
		}

		// soma o array: soma(numero*peso)
		for (int i = 0; i < size; i++) {
			int weight = i + 1;
			sum += arrayNumber[i] * arrayWeight[weight];
		}

		int firstDigit = 11 - sum % 11;

		int firstDigitVerify = arrayNumber[11];

		if (firstDigitVerify != firstDigit) {
			throw new Error("1º Digito verificador errado");
		}

		for (int i = 0; i < size; i++) {
			sum2 += arrayNumber[i] * arrayWeight[i];
		}

		int secondDigit = 11 - sum2 % 11;

		int secondDigitVerify = arrayNumber[12];

		if (secondDigit == 10 || secondDigit == 11) {
			secondDigit = 0;
		}

		if (secondDigitVerify != secondDigit) {
			throw new Error("2º Digito verificador errado");
		}

		System.out.println("IE Válido!!!!");

		return secondDigitVerify == secondDigit ? true : false;
	}

	public Boolean alagoas(String ie) {
		// Transforma a string em um array de char
		char[] array = ie.toCharArray();

		// transforma o array de char em array de int
		int[] arrayNumber = new int[array.length];

		// array de peso a ser usado
		int[] arrayWeight = new int[array.length];

		int cont = 0;
		int sum = 0;
		int size = arrayNumber.length;

		// converte o char em int
		for (char c : array) {
			int x = c - '0';
			arrayNumber[cont] = x;
			cont++;
		}
		
		if (arrayNumber[0] != 2 || arrayNumber[1] != 4) {
			throw new Error("O código deve começar com 24");
		}
		
		// reinicia o contador
		cont = 0;
		
		// gera array de pesos
		for (int i = 9; i > 1; i--) {
			arrayWeight[cont] = i;
			cont++;
		}

		// soma a multiplicação entre os números e os pesos
		for (int i = 0; i < array.length; i++) {
			sum += arrayNumber[i] * arrayWeight[i];
		}

		int firstDigit = (sum * 10 - (sum / 11) * 11);
		
		if (firstDigit == 10) {
			firstDigit = 0;
		}

		size--;

		int numberFinal = arrayNumber[size];

		return numberFinal == firstDigit ? true : false;
	}

	public Boolean amapa(String ie) {

		// Transforma a string em um array de char
		char[] array = ie.toCharArray();

		// transforma o array de char em array de int
		int[] arrayNumber = new int[array.length];

		// array de peso a ser usado
		int[] arrayWeight = new int[array.length];

		int cont = 0;
		int sum = 0;
		int size = arrayNumber.length;

		// converte o char em int
		for (char c : array) {
			int x = c - '0';
			arrayNumber[cont] = x;
			cont++;
		}

		
		if (arrayNumber[0] != 0 || arrayNumber[1] != 3) {
			throw new Error("O código deve começar com 24");
		}
		
		// reinicia o contador
		cont = 0;
		
		// gera array de pesos
		for (int i = 9; i > 1; i--) {
			arrayWeight[cont] = i;
			cont++;
		}

		// soma a multiplicação entre os números e os pesos
		for (int i = 0; i < array.length; i++) {
			sum += arrayNumber[i] * arrayWeight[i];
		}

		int firstDigit = (sum * 10 - (sum / 11) * 11);
		
		if (firstDigit == 10) {
			firstDigit = 0;
		}

		size--;

		int numberFinal = arrayNumber[size];

		return numberFinal == firstDigit ? true : false;
	}

	public Boolean amazonas(String ie) {
		
		int cont = 0;
		int sum = 0;
		int size = ie.length();

		
		// Transforma a string em um array de char
		char[] array = ie.toCharArray();

		// transforma o array de char em array de int
		int[] arrayNumber = new int[array.length];

		// array de peso a ser usado
		int[] arrayWeight = new int[array.length];

		
		// converte o char em int
		for (char c : array) {
			int x = c - '0';
			arrayNumber[cont] = x;
			cont++;
		}

		// reinicia o contador
		cont = 0;

		for (int i = 9; i > 1; i--) {
			arrayWeight[cont] = i;
			cont++;
		}

		// soma a multiplicação entre os números e os pesos
		for (int i = 0; i < array.length; i++) {
			sum += arrayNumber[i] * arrayWeight[i];
		}

		int firstDigit = 11 - sum % 11;
		
		if(firstDigit <= 1) {
			firstDigit = 0;
		}

		size--;

		int numberFinal = arrayNumber[size];

		return numberFinal == firstDigit ? true : false;
	}

	public Boolean bahia(String ie) {
		ie = "12345663";
		int count = 0;
		int sum = 0;
		int size = ie.length();

		char[] array = ie.toCharArray();
		
		int[] arrayNumber = new int[size];
		int[] arrayWeight = new int[size];
		
		
		// convert char em int
		for (char c : array) {
			int x = c - '0';
			arrayNumber[count] = x;
			count++;
		}
		
		count = 0;
		for(int i = 8; i>1; i--) {
			arrayWeight[count] = i;
			count++;
		}
		
	
		for(int i = 0; i < 6; i++) {
			int a = i+1;
			sum += arrayNumber[i] * arrayWeight[a];
		}
		
		int result = 10 -  sum / 10;
		
		if(result != arrayNumber[7]) {
			throw new Error("Verificador diferente");
		}
		
		
		for(int i = 0; i < 5; i++) {
			
			sum += arrayNumber[i] * arrayWeight[i];
			System.out.println(arrayNumber[i] + "-"+ arrayWeight[i]);
			
		}
		
		sum +=arrayNumber[7] * 2; 
		
		
		
		
		
		
		
		return true;
		
	}

	public Boolean ceara(String ie) {
		// Transforma a string em um array de char
		char[] array = ie.toCharArray();

		// transforma o array de char em array de int
		int[] arrayNumber = new int[array.length];

		// array de peso a ser usado
		int[] arrayWeight = new int[array.length];

		int cont = 0;
		int sum = 0;
		int size = arrayNumber.length;

		// converte o char em int
		for (char c : array) {
			int x = c - '0';
			arrayNumber[cont] = x;
			cont++;
		}

		// reinicia o contador
		cont = 0;

		for (int i = 9; i > 1; i--) {
			arrayWeight[cont] = i;
			cont++;
		}

		// soma a multiplicação entre os números e os pesos
		for (int i = 0; i < array.length; i++) {
			sum += arrayNumber[i] * arrayWeight[i];
		}

		int firstDigit = 11 - sum % 11;

		size--;

		int numberFinal = arrayNumber[size];

		return numberFinal == firstDigit ? true : false;
	}

	
	public void distritoFederal(String ie) {

	}

	
	public void espiritoSanto(String ie) {

	}

	public void goias(String ie) {

	}

	public void maranhão(String ie) {

	}

	public void matoGrosso(String ie) {

	}

	public void matoGrossoDoSul(String ie) {

	}

	public void minasGerais(String ie) {

	}

	public void para(String ie) {

	

	}

	public void sergipe() {

	}

	public void saoPaulo() {

	}

	public void santaCatarina() {

	}

	public void roraima() {

	}

	public void rondonia() {

	}

	public void rioGrandeDoSul() {

	}

	public void rioGrandeDoNorte() {

	}

	public void rioDeJaneiro() {

	}

	public void piaui() {

	}

	public void pernambuco() {

	}

	public void parana() {

	}

	public void paraiba() {

	}
	
	public Boolean tocantins(String ie) {
		String TO = "29010227836";
		int count = 0;
		int sum = 0;
		
		int size = TO.length();
		char[] arrayChar = TO.toCharArray();
		int[] arrayInt = new int[size];
		int[] arrayWeight = new int[size];
 		
		for (int c : arrayChar) {
			int x = c - '0';
			arrayInt[count] = x;
			count++;
		}
		
		arrayWeight[0] = 9;
		arrayWeight[1] = 8;
		arrayWeight[2] = 0;
		arrayWeight[3] = 0;
		arrayWeight[4] = 7;
		arrayWeight[5] = 6;
		arrayWeight[6] = 5;
		arrayWeight[7] = 4;
		arrayWeight[8] = 3;
		arrayWeight[9] = 2;
		arrayWeight[10] = 0;
		
		for (int i = 0; i < size; i++) {
			sum+= arrayInt[i] * arrayWeight[i];
		}
		
		int result = 11 - sum % 11;
		
		
		
		return result == arrayInt[10] ? true : false;
	}

}
