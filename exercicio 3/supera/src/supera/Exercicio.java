package supera;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Exercicio {

	public static void main(String[] args) {
		int k = 2;
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(5);
		arr.add(3);
		arr.add(4);
		arr.add(2);
		
		ArrayList<Integer> arr2 = new ArrayList<>();
	
		Collections.sort(arr);
		
		
		
		for (int i = 0; i < arr.size(); i++) {
			
			arr2 = arr;
			
			System.out.println(arr);
			System.out.println("i = " + i);
				
			for (int j = 1; j < arr.size() - 1; j++) {
				int y = arr.get(j);
				int n = arr.get(i); 
				int r = Math.abs(y - n);
				
				System.out.println("j = "+j);
				System.out.println(n+" - "+ y +" = "+r);
				if(r == k) {
					System.out.println("igual");
					
					arr.remove(i);
					//arr.remove(i);
					//arr2.add(arr.get(i));
					//contador++;
				}
			}
			
//			System.out.println(n +" : "+y);
//			System.out.println(r +" : ");
		}
		//Collections.sort(arr, Collections.reverseOrder());
		
//		for (int i = 0; i < arr.size() - 1; i++) {
//			int y = arr.get(i + 1);
//			int n = arr.get(i); 
//			int r = Math.abs(y - n);
//			System.out.println(n +" : "+y);
//			System.out.println(r +" : ");
//			if(r == k) {
//				System.out.println("entrou");
//				arr2.add(arr.get(i));
//			}
//		}
//		
//		System.out.println(arr2);
	}

}
