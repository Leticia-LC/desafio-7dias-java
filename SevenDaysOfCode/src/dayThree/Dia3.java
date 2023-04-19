package dayThree;

public class Dia3 {

	public static void main(String[] args) {
		// Write a Java program to calculate the average value of array elements.
	
		int[] numArray = {1, 3, 17, 5, 10, 20};
		int sum = 0;
		
		for (int i = 0; i < numArray.length; i++) {
			sum += numArray[i];
		}
		
		double media = sum / numArray.length;
		
		System.out.println("A média dos valores é igual a: " + media);
		
	}

}
