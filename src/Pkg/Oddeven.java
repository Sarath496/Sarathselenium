package Pkg;

public class Oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		        System.out.println("Odd Numbers:");
		        for (int number : numbers) {
		            if (number % 2 != 0) {
		                System.out.print(number + " ");
		            }
		        }

		        System.out.println("\nEven Numbers:");
		        for (int number : numbers) {
		            if (number % 2 == 0) {
		                System.out.print(number + " ");
		        }          
		  }
		    }
		
	}


