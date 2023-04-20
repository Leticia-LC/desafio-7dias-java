package dayFour;

public class Dia4 {

	public static void main(String[] args) {
		// Write a Java program to find the common elements between two arrays of integers.
		
		int[] numArray = {1, 2, 8, 10, 22, 7, 6};
		int[] numArray2 = {3, 4, 2, 9, 7, 24, 1};
		
		for (int i = 0; i < numArray.length; i++) {
			
			for (int j = 0; j < numArray2.length; j++) {
				
				if (numArray[i] == numArray2[j]) {
					
					System.out.println("O elemento em comum é: " + (numArray[i]));
				}
			}
		}

	}

}
