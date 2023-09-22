import java.util.Scanner;

public class Utilidades {
	Scanner input = new Scanner(System.in);

	public void Somatorio() {
		int quantidade;

		System.out.println("informe quantos numeros voce quer somar");
		quantidade = input.nextInt();
		int somar = 0;
		int[] numeros = new int[quantidade];

		System.out.println("informe os numeros que voce quer somar");

		for (int i = 0; i < quantidade; i++) {
			numeros[i] = input.nextInt();
			if (i >= 2 && i <= numeros.length - 3) {
				somar += numeros[i];
			}
		}

		System.out.print("o valor da soma eh: " + somar);
	}

	public void NumerosPar() {
		int quantidade;
		System.out.println("informe a quantidade de numeros");
		quantidade = input.nextInt();
		int[] numeros = new int[quantidade];
		int[] pares = new int[quantidade];

		System.out.println("informe os numeros que deseja:");
		int j = 0;
		for (int i = 0; i < quantidade; i++) {
			numeros[i] = input.nextInt();
			if (numeros[i] % 2 == 0) {
				pares[j] = numeros[i];
				j++;
			}
		}

		System.out.print("os valores pares sao:");
		for (int i = 0; i < pares.length; i++) {
			if (pares[i] != 0)
				System.out.print(" " + pares[i]);
		}
	}

	public void Media() {
		int[] quantidade = new int[2];
		float resultado, soma = 0;

		System.out.println("informe o tamanho dos dois vetores:");
		for (int i = 0; i < 2; i++) {
			quantidade[i] = input.nextInt();
		}

		int[] numeros1 = new int[quantidade[0]];
		int[] numeros2 = new int[quantidade[1]];

		float somaDosDenomidadores = numeros1.length + numeros2.length;

		for (int i = 0; i < 2; i++) {
			System.out.println("informe os numeros que voce quer somar do vetor " + (i + 1));
			for (int j = 0; j < quantidade[i]; j++) {
				if (i == 0)
					numeros1[j] = input.nextInt();

				if (i == 1)
					numeros2[j] = input.nextInt();
			}
		}

		for (int i = 0; i < numeros1.length; i++) {
			soma += numeros1[i];
		}

		for (int i = 0; i < numeros2.length; i++) {
			soma += numeros2[i];
		}
		resultado = soma / somaDosDenomidadores;
		System.out.println("A media eh: " + resultado);
	}

	public void MediaPonderada() {
		System.out.println("informe quantos numeros ira calcular:");
		int quantidade = input.nextInt();

		int[] numeros = new int[quantidade];
		int[] pesos = new int[quantidade];
		int somaPesos = 0, somaDivisores = 0;
		float resultado = 0;

		System.out.println("informe um numero e seu peso correspondente");
		for (int i = 0; i < quantidade; i++) {
			System.out.println("informe o numero " + (i + 1));
			numeros[i] = input.nextInt();
			System.out.println("informe o peso " + (i + 1));
			pesos[i] = input.nextInt();

		}

		for (int i = 0; i < numeros.length; i++) {
			somaDivisores += numeros[i] * pesos[i];
			somaPesos += pesos[i];
		}

		resultado = (float) somaDivisores / somaPesos;
		System.out.print("o valor da Media Ponderada eh: " + resultado);
	}

	public void ContagemElementos() {
		int[] quantidade = new int[2];

		System.out.println("infore o tamanho dos dois vetores:");
		for (int i = 0; i < 2; i++) {
			quantidade[i] = input.nextInt();
		}

		int[] numeros1 = new int[quantidade[0]];
		int[] numeros2 = new int[quantidade[1]];

		for (int i = 0; i < 2; i++) {
			System.out.println("informe os numeros do vetor " + (i + 1));
			for (int j = 0; j < quantidade[i]; j++) {
				if (i == 0)
					numeros1[j] = input.nextInt();

				if (i == 1)
					numeros2[j] = input.nextInt();
			}
		}
		System.out.println("agora informe qual numero voce quer contar");
		int contador = input.nextInt();

		int resultado = 0;
		for (int i = 0; i < numeros1.length; i++) {
			if (numeros1[i] == contador)
				resultado++;
		}

		for (int i = 0; i < numeros2.length; i++) {
			if (numeros2[i] == contador)
				resultado++;
		}

		System.out.print("a quantidade de vezes que o valor " + contador + " aparece eh: " + resultado);
	}

	public void CopiaVetor() {
		int quantidade;
		System.out.println("informe quantos numeros voce quer colocar no array");
		quantidade = input.nextInt();

		int[] numeros = new int[quantidade];
		int[] copia = new int[quantidade];

		System.out.println("informe os numeros que voce quer copiar");

		for (int i = 0; i < quantidade; i++) {
			numeros[i] = input.nextInt();
		}

		for (int i = 0; i < quantidade; i++) {
			copia = copiar(numeros, quantidade);
		}

		System.out.println("aqui temos os valores originais");
		for (int i = 0; i < quantidade; i++) {
			System.out.print("\t" + numeros[i]);
		}
		System.out.println("\ne aqui temos os valores copiados");
		for (int i = 0; i < quantidade; i++) {
			System.out.print("\t" + copia[i]);
		}
	}

	public void OrdencaoCrescente() {
		int quantidade;

		System.out.println("informe quantos numeros voce quer colocar no array");
		quantidade = input.nextInt();

		int[] numeros = new int[quantidade];

		System.out.println("informe os numeros que voce quer organizar");

		for (int i = 0; i < quantidade; i++) {
			numeros[i] = input.nextInt();
		}

		for (int i = 0; i < (numeros.length - 1); i++) {
			int iMinimo = i;
			for (int j = i + 1; j < numeros.length; j++) // verifica qual o menor valor do array
			{
				if (numeros[j] < numeros[iMinimo]) {
					iMinimo = j;
				}
			}
			if (iMinimo != i) // verifica se o indice minimo condiz com o valor do indice i
			{
				int aux = numeros[i];
				numeros[i] = numeros[iMinimo];
				numeros[iMinimo] = aux;
			}
		}

		System.out.println("aqui esta o vetor ordenado:");
		for (int i = 0; i < quantidade; i++) {
			System.out.println(numeros[i]);
		}
	}

	public void VerificarOrdenacao() {
		int quantidade;
		boolean verificar = true;

		System.out.println("informe quantos numeros voce quer colocar no array");
		quantidade = input.nextInt();

		int[] numeros = new int[quantidade];

		System.out.println("informe os numeros que voce quer organizar");

		for (int i = 0; i < quantidade; i++) {
			numeros[i] = input.nextInt();
			if (i != 0) {
				if (numeros[i] < numeros[i - 1])
					verificar = false;
			}
		}

		System.out.println(verificar);

	}

	public void KMaiorValor() {
		int quantidade;
		Scanner input = new Scanner(System.in);

		System.out.println("informe quantos numeros voce quer colocar no array");
		quantidade = input.nextInt();

		int[] numeros = new int[quantidade];

		System.out.println("informe os numeros que voce quer:");

		for (int i = 0; i < quantidade; i++) {
			numeros[i] = input.nextInt();
		}

		System.out.println("informe os k-esimo maior numero que voce quer:");
		int kesimo = input.nextInt();

		numeros = ordenador(numeros);

		if (kesimo > numeros.length)
			System.out.println("-1");

		else
			System.out.println(numeros[numeros.length - kesimo]);
	}

	public void KMenorValor() {
		int quantidade;
		Scanner input = new Scanner(System.in);

		System.out.println("informe quantos numeros voce quer colocar no array");
		quantidade = input.nextInt();

		int[] numeros = new int[quantidade];

		System.out.println("informe os numeros que voce quer:");

		for (int i = 0; i < quantidade; i++) {
			numeros[i] = input.nextInt();
		}

		System.out.println("informe os k-esimo maior numero que voce quer:");
		int kesimo = input.nextInt();

		numeros = ordenador(numeros);

		if (kesimo > numeros.length)
			System.out.println("-1");

		else
			System.out.println(numeros[kesimo - 1]);
	}

	public void VerificarIgualdade() {
		int[] quantidade = new int[2];
		boolean iguais = true;

		System.out.println("informe o tamanho dos dois vetores:");
		for (int i = 0; i < 2; i++) {
			quantidade[i] = input.nextInt();
		}

		int[] numeros1 = new int[quantidade[0]];
		int[] numeros2 = new int[quantidade[1]];

		for (int i = 0; i < 2; i++) {
			System.out.println("informe os numeros que voce quer por no vetor " + (i + 1));
			for (int j = 0; j < quantidade[i]; j++) {
				if (i == 0)
					numeros1[j] = input.nextInt();

				if (i == 1)
					numeros2[j] = input.nextInt();
			}
		}
		for (int i = 0; i < numeros1.length; i++) {
			if (numeros1[i] != numeros2[i])
				iguais = false;
		}

		if (quantidade[0] != quantidade[1])
			System.out.println("Os vetores sao diferentes");

		else if (iguais == false)
			System.out.println("Os vetores sao diferentes");

		else
			System.out.println("Os vetores são iguais");

	}

	public void Potenciacao() {
		System.out.println("informe o numero que voce quer como base");
		int base = input.nextInt();

		System.out.println("informe o numero que voce quer como expoente");
		int expoente = input.nextInt();

		int pot = 1;
		for (int i = 0; i < expoente; i++) {
			pot *= base;
		}

		System.out.println("o valor da potencia eh: " + pot);
	}

	public void Primo() {
		boolean primo = false;
		System.out.println("insira um numero:");
		int numero = input.nextInt();

		if (numero == 2 || numero == 3 || numero == 5 || numero == 7)
			primo = true;

		else if (numero % 2 != 0 && numero % 3 != 0 && numero % 5 != 0 && numero % 7 != 0)
			primo = true;

		if (primo == true)
			System.out.println("o numero eh primo");

		else
			System.out.println("o numero NAO eh primo");
	}

	public void Ocorrencia() {
		System.out.println("informe o tamanho dos vetores");
		int tamanho = input.nextInt();
		char[] vetor1 = new char[tamanho];
		char[] vetor2 = new char[tamanho];

		for (int i = 0; i < 2; i++) {
			System.out.println("informe os valores do vetor " + (i + 1));
			for (int j = 0; j < tamanho; j++) {
				if (i == 0)
					vetor1[j] = input.next().charAt(0);

				if (i == 1)
					vetor2[j] = input.next().charAt(0);
			}
		}

		System.out.println("aqui esta os valores iguais:");
		for (int i = 0; i < ocorrencia(vetor1, vetor2).length; i++) {
			System.out.print(ocorrencia(vetor1, vetor2)[i] + " ");
		}
	}

	public void Remocao() {
		System.out.println("informe o tamanho dos vetores");
		int tamanho = input.nextInt();
		char[] vetor = new char[tamanho];

		System.out.println("informe os valores do vetor");
		for (int i = 0; i < tamanho; i++) {
			vetor[i] = input.next().charAt(0);
		}

		System.out.println("informe o valor que deseja retirar:");
		char exclui = input.next().charAt(0);

		int cont = 0, j = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != exclui)
				cont++;
		}
		char[] retorno = new char[cont];

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != exclui) {
				retorno[j] = vetor[i];
				j++;
			}
		}

		System.out.println("aqui esta o vetor com o elemento retirado:");
		for (int i = 0; i < retorno.length; i++) {
			System.out.print(retorno[i] + " ");
		}
	}

	public void VerificarPalindromo() {
		System.out.println("coloque uma palavra:");
		String palavra = input.nextLine();
		boolean verificar = false;

		int numeroDePalavras = palavra.length() - 1;
		char[] letrasDaPalavra = new char[palavra.length()];

		palavra.getChars(0, palavra.length(), letrasDaPalavra, 0);

		for (int i = 0, j = numeroDePalavras; i <= numeroDePalavras && j >= 0; i++, j--) {
			if (letrasDaPalavra[i] != letrasDaPalavra[j])
				verificar = false;
		}
		verificar = true;

		System.out.println(verificar);
	}

	public void VerificarNumeroPrimo() {
		System.out.println("insira um numero:");
		int numero = input.nextInt();

		if ((numero == 2 || numero == 3 || numero == 5 || numero == 7))
			System.out.println("o numero eh primo");

		else if (numero % 2 != 0 && numero % 3 != 0 && numero % 5 != 0 && numero % 7 != 0)
			System.out.println("o numero eh primo");

		else
			System.out.println("o numero NAO eh primo");
	}

	public void InverterPalavra() {
		System.out.println("coloque uma palavra:");
		String palavra = input.nextLine();

		int numeroDeLetras = palavra.length() - 1;
		char[] letrasDaPalavra = new char[palavra.length()];
		char[] novaPalavra = new char[palavra.length()];

		palavra.getChars(0, palavra.length(), letrasDaPalavra, 0);

		for (int i = 0, j = numeroDeLetras; i <= numeroDeLetras && j >= 0; i++, j--) {
			novaPalavra[i] = letrasDaPalavra[j];
		}

		System.out.println(novaPalavra);
	}

	public void CalcularJuro() {
		System.out.println("informe o dinheiro incial, a taxa de juros e o periodo de cobranca");
		float dinicial = input.nextFloat();
		float taxaJuros = input.nextFloat();
		int periodo = input.nextInt();

		float montante = dinicial * (float) Math.pow(taxaJuros + 1, periodo);

		float juros = montante - dinicial;

		System.out.println("o valor do juros eh: " + juros);
	}

	public void VerificarNPerfeito() {
		System.out.println("informe o numero:");
		int numero = input.nextInt();

		int soma = 0;

		for (int i = 1; i < numero; i++) {
			if (numero % i == 0)
				soma = soma + i;
		}
		if (soma == numero)
			System.out.println("true");
		else
			System.out.println("false");
	}

	public void ImprimirElementos() {
		System.out.println("informe o numero de linhas e colunas:");
		int linhas = input.nextInt();
		int colunas = input.nextInt();

		input.close();

		System.out.print("a)\n");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < linhas; j++) {
				if (j <= i)
					System.out.print(j + " ");

				else
					System.out.print("  ");
			}
			System.out.println();
		}

		System.out.println("\nb)");

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if ((i + j) % 2 == 0)
					System.out.print("@ ");

				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}

////////////funçoes a parte
	public static int[] ordenador(int[] n) {
		for (int i = 0; i < (n.length - 1); i++) {
			int iMinimo = i;
			for (int j = i + 1; j < n.length; j++) {
				if (n[j] < n[iMinimo]) {
					iMinimo = j;
				}
			}
			if (iMinimo != i) {
				int aux = n[i];
				n[i] = n[iMinimo];
				n[iMinimo] = aux;
			}
		}
		return n;
	}

	public static int[] copiar(int[] n, int q) {
		int[] arrayCopiado = new int[q];
		for (int i = 0; i < n.length; i++) {
			arrayCopiado[i] = n[i];
		}
		return arrayCopiado;
	}

	public static char[] ocorrencia(char n[], char m[]) {
		int cont = 0, j = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] == m[i])
				cont++;
		}
		char[] retorno = new char[cont];

		for (int i = 0; i < n.length; i++) {
			if (n[i] == m[i]) {
				retorno[j] = n[i];
				j++;
			}
		}
		return retorno;
	}
}
