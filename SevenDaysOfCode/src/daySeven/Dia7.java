package daySeven;

public class Dia7 {

	public static void main(String[] args) {
		// Write a Java program to find the duplicate values of an array of integer values.
		
		int[] numArray = {6, 11, 11, 20, 34, 6, 10, 15};
		
		for (int i = 0; i < numArray.length - 1; i++) {
			
			for (int j = i + 1; j < numArray.length; j++) {
				
				if((numArray[i] == numArray[j]) && (i != j)) {
					
					System.out.println("Valor duplicado: " + numArray[j]);
				}
			}
		}

	}

}
