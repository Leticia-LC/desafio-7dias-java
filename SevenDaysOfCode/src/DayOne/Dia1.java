package DayOne;

import java.util.Arrays;

public class Dia1 {
	
	public static void main(String[] args) {
		
		//Write a Java program to sort a numeric array and a string array.
		
		int[] numArray = {2, 9, 1, 8, 3, 4, 7};
		String[] stringArray = {"capivara", "gato", "cachorro", "coelho", "cavalo", "raposa"};
		
		Arrays.sort(numArray);
		Arrays.sort(stringArray);
		
		System.out.println("Número sorteado: " + Arrays.toString(numArray));
		System.out.println("String sorteada: " + Arrays.toString(stringArray));
		
	}

}
