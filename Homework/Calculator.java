package Homework;
import java.util.Scanner;

public class Calculator {
	
	public static void add(double num1, double num2) {

			double sum = num1 + num2 ;
			System.out.println(num1 + " + " + num2 + " = " + sum);

	}
	
	public static void subtract(double num1, double num2) {

			double difference = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + difference);

	}
	
	public static void multiply(double num1, double num2) {
			
			double product = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + product);

	}
	
	public static void divide(double num1, double num2) {
			
			if ( num2 != 0 ) {
				double quotient = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + quotient);
			}
			else System.out.println("cannot divide by 0");	

	}
	
	public static void main(String[] args) {
		
		char operator = ' ';
		double x, y;
		
		while (operator != '#') {
			
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);		
		System.out.println("Enter operation to be performed ( + , - , * , / ) or # to exit");
			operator = input.next().charAt(0);
						
				switch ( operator ) {
					case '#' : 
						break;
			
					case '+' :
						
						System.out.println("Enter numbers to be added ");					
							x = input.nextDouble();
							y = input.nextDouble();
							
						add(x, y);
						break;
				
					case '-' :

						System.out.println("Enter numbers to be subtracted ");					
							x = input.nextDouble();
							y = input.nextDouble();
							
						subtract(x, y);
						break;
				
					case '*' :
						
						System.out.println("Enter numbers to be multiplied ");					
						x = input.nextDouble();
						y = input.nextDouble();
						multiply(x, y);
						break;
				
					case '/' :
						
						System.out.println("Enter numbers to be divided ");					
						x = input.nextDouble();
						y = input.nextDouble();
						divide(x, y);
						break;
				
					default :
						System.out.println("undefined operator, try again");
				}
		}					
	}
}

