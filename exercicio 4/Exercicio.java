import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		try {
			List<String> arr = new ArrayList<>();
			
			Scanner scanner = new Scanner(System.in);
			
			int n = scanner.nextInt();
			scanner.nextLine();
			
			for (int i = 0; i < n; i++) {
				arr.add(scanner.nextLine());
			}
			
			int arrTamanho = arr.size();
			
			for (int b = 0; b < arrTamanho; b++) {
				
				int tamanhoFrase = arr.get(b).length();
				
				if(tamanhoFrase % 2 == 0) {
					String posicao = arr.get(b);
					
					String metade = posicao.substring(0, tamanhoFrase / 2);
					String outraMetade = posicao.substring(tamanhoFrase / 2, tamanhoFrase);
							
					String decifrada = "";
					
					for (int a = metade.length() - 1; a >= 0; a--) {
						decifrada += metade.charAt(a);
					}
					
					for (int l = outraMetade.length() - 1; l >= 0; l--) {
						decifrada += outraMetade.charAt(l);
					}
					
					System.out.println(decifrada);
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Infelizmente os valores informados não segue as regras");
		}
	}

}