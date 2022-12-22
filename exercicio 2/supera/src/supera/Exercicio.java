package supera;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// definir local para aceitar ponto
		input.useLocale(Locale.ENGLISH); 
		
		DecimalFormat df = new DecimalFormat("#");
		// formatar com 1 casa e não arredondar
		df.setRoundingMode(RoundingMode.DOWN);
		
		double valor = input.nextDouble();
		
		double[] notas = {100, 50, 20, 10, 5, 2};
		double[] moedas = {1, 0.50, 0.25, 0.10, 0.05, 0.01};
	
		System.out.println("NOTAS:");
		for (int i = 0; i < notas.length; i++) {
			double nota = valor / notas[i];
			
			System.out.println(df.format(nota) + "\t nota(s) \t de \t R$ \t " + String.format(Locale.ENGLISH, "%.2f", notas[i]));
			
			valor = valor % notas[i];
		}
		
		System.out.println("MOEDAS:");
		for (int i = 0; i < moedas.length; i++) {
			double nota = valor / moedas[i];
			
			// formatar corretamento o ultimo valor
			if(i == 5) {
				System.out.println(String.format(Locale.ENGLISH, "%.0f", nota) + " moedas(s) de R$ " + String.format(Locale.ENGLISH, "%.2f", moedas[i]));
			}else {
				System.out.println(df.format(nota) + "\t  moedas(s) \t  de \t R$ \t " + String.format(Locale.ENGLISH, "%.2f", moedas[i]));
			}
			
			valor = valor % moedas[i];
		}
	}
}
