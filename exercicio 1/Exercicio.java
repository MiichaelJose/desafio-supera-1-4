import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exercicio {

	/*
	 * 1 - Entrada de valores inteiros não negativos
	 * 2 - Ordene (Primeiro os Pares, Depois os Ímpares)
	 * 3 - Pares ordem crescente e os ímpares ordem decrescente
	 * 4 - Linha de entrada um único inteiro positivo N (1 < N <= 105) número de linhas de entrada
	 * 5 - As próximas N linhas conterão, cada uma delas, um valor inteiro não negativo.
	 * 6 - Apresente os valores da entrada segundo apresentada acima. Cada deve ser impresso em uma linha
	 */ 
	

	public static void main(String[] args) {
		List<Integer> arrPar = new ArrayList<>();
		List<Integer> arrImpar = new ArrayList<>();
		
		try {
			Scanner input = new Scanner(System.in);
			
			System.out.println("passe os seguinte valores, primeiro o número de linhas e depois os valores inteiros");
			System.out.println("Numero de linhas: ");
			
			int linhas = input.nextInt();
			
			for (int i = 0; i < linhas; i++) {
				int n = input.nextInt();
				
				if(n < 0) {		
					System.out.println("Não é permitido valores negativos");
				}else {
					if((n % 2) == 0) {
						arrPar.add(n);
					}else {
						arrImpar.add(n);
					}
				}
			}
			
			Collections.sort(arrPar);
			
			for (int n : arrPar) {
			      System.out.println(n);
			}
			
			Collections.sort(arrImpar, Collections.reverseOrder());
			
			for (int n : arrImpar) {
			      System.out.println(n);
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Infelizmente os valores informados não segue as regras");
		}
	}
}