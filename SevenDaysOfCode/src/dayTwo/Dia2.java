package dayTwo;

public class Dia2 {

	public static void main(String[] args) {
		// Write a Java program to sum values of an array.
		
		int[] numArray = {9, 1, 3, 6, 8, 7};
		int sum = 0;
		
		for (int i = 0; i < numArray.length; i++) {
			sum += numArray[i];
			
		}
		
		System.out.println("A soma dos valores é igual a: " + sum);
		
	}

}
