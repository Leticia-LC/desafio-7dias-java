package daySix;

import java.util.Arrays;

public class Dia6 {

	public static void main(String[] args) {
		// Write a Java program to insert an element (specific position) into an array.
		
		int[] numArray = {3, 16, 9, 10, 35, 18};
		int insereNum = 3;
		int valorNovo = 27;   
		   
		  for(int i = numArray.length-1; i > insereNum; i--){
		    numArray[i] = numArray[i - 1];
		    
		   }
		  
		   numArray[insereNum] = valorNovo;
		   
		   System.out.println("Novo Array: " + Arrays.toString(numArray));
		   
	}

}
