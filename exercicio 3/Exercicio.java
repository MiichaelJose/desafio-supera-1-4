import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();

		try {
			Scanner scanner = new Scanner(System.in);
			
			int nLinhas = scanner.nextInt();
			int k = scanner.nextInt();

			for (int i = 0; i < nLinhas; i++) {
				int n = scanner.nextInt();
				
				if(n >= 0) {
					arr.add(n);
				}else {
					System.out.println("Não é permitido valores negativos");
				}
				
				
				if(i == nLinhas - 1) {
					int contador = 0;
					
					for (int j = 0; j < nLinhas; j++) {
						
						for (int l = j + 1; l < nLinhas; l++) {
							if (Math.abs(arr.get(j) - arr.get(l)) == k) {
								contador++;
							}
						}
					}
					
					System.out.println(contador);
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Infelizmente os valores informados não segue as regras");
		}
	}

}
