package dayFive;

import java.util.Arrays;

public class Dia5 {

	public static void main(String[] args) {
		// Write a Java program to remove a specific element from an array.
		
		 int[] numArray = {1, 6, 10, 22, 27, 5, 7};   
		   
		   int removeNum = 3;

		   for(int i = removeNum; i < numArray.length -1; i++){
		        numArray[i] = numArray[i + 1];
		      }
		   
		    System.out.println("Após remover o quarto elemento: " + Arrays.toString(numArray));
		
	}
}