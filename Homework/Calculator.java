package Homework;
import java.util.Scanner;

public class Calculator {
	
	public static double add(double num1, double num2, double sumNums) {
		sumNums = num1 + num2;
		return  sumNums;
	}
	
	public static double subtract(double num1, double num2, double differenceNums) {

		differenceNums = num1 - num2;
		return differenceNums;
	}
	
	public static double multiply(double num1, double num2, double productNums) {
			
		productNums = num1 * num2;
		return productNums;
	}
	
	public static double divide(double num1, double num2, double quotientNums) {
			
		quotientNums = num1 / num2;
		return quotientNums;	
	}
	
	public static void main(String[] args) {
		
		char operator = ' ';
		double x, y, sum, difference, product, quotient;
		
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
							sum = 0 ;							
								add(x, y, sum);					
								System.out.println( x + " + " + y + " = " + add(x, y, sum) );
						break;
				
					case '-' :

						System.out.println("Enter numbers to be subtracted ");					
							x = input.nextDouble();
							y = input.nextDouble();
							difference = 0;							
								subtract(x, y, difference);
								System.out.println( x + " - " + y + " = " + subtract(x, y, difference) );
						break;
				
					case '*' :
						
						System.out.println("Enter numbers to be multiplied ");					
							x = input.nextDouble();
							y = input.nextDouble();
							product = 0;
								multiply(x, y, product);
								System.out.println( x + " * " + y + " = " + multiply(x, y, product) );
						break;
				
					case '/' :
						
						System.out.println("Enter numbers to be divided ");					
							x = input.nextDouble();
							y = input.nextDouble();
							quotient = 0;
								if (y != 0) {
									divide(x, y, quotient);
									System.out.println( x + " / " + y + " = " + divide(x, y, quotient) );
								} 
								else System.out.println("Cannot divide by 0, Try again ");
						break;
				
					default :
						System.out.println("Undefined operator, Try again");
				}
		}					
	}
}

