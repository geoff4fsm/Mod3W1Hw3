package Homework;
import java.util.Scanner;

public class Calculator {
	
		// addition method
	public static double add(double num1, double num2, double sumNums) {
		sumNums = num1 + num2;
		return  sumNums;
	}
	
		// subtraction method
	public static double subtract(double num1, double num2, double differenceNums) {

		differenceNums = num1 - num2;
		return differenceNums;
	}
	
		// multiplication method
	public static double multiply(double num1, double num2, double productNums) {
			
		productNums = num1 * num2;
		return productNums;
	}
	
		// division method
	public static double divide(double num1, double num2, double quotientNums) {
			
		quotientNums = num1 / num2;
		return quotientNums;	
	}
	
	public static void main(String[] args) {
		
			// define variables by types
		char operator = ' ';
		double x, y, sum = 0, difference = 0, product = 0, quotient = 0;
		
		while (operator != '#') {
			
				// input operator
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);		
			System.out.println("Enter operation to be performed ( + , - , * , / ) or # to exit");
				operator = input.next().charAt(0);
					
						// option to end program
					switch ( operator ) {
						case '#' : 
							break;
			
							// addition case
						case '+' :
							
								// input numbers to be added
							System.out.println("Enter numbers to be added ");					
								x = input.nextDouble();
								y = input.nextDouble();
								
										// call add method
									add(x, y, sum);
									
										// print sum
									System.out.println( x + " + " + y + " = " + add(x, y, sum) );
						break;
						
							// subtraction case
						case '-' :

								// input numbers to be subtracted
							System.out.println("Enter numbers to be subtracted ");					
								x = input.nextDouble();
								y = input.nextDouble();

										// call subtract method
									subtract(x, y, difference);
									
										// print difference
									System.out.println( x + " - " + y + " = " + subtract(x, y, difference) );
						break;
				
							// multiplication case
						case '*' :
						
								// input numbers to be multiplied
							System.out.println("Enter numbers to be multiplied ");					
								x = input.nextDouble();
								y = input.nextDouble();

										// call multiply method
									multiply(x, y, product);
										
										// print product
									System.out.println( x + " * " + y + " = " + multiply(x, y, product) );
						break;
				
							// division case
						case '/' :
						
								// input numbers to be divided
							System.out.println("Enter numbers to be divided ");					
								x = input.nextDouble();
								y = input.nextDouble();
								
										// check if trying to divide by 0
									if (y != 0) {
										
											// call divide method
										divide(x, y, quotient);
										
											// print quotient
										System.out.println( x + " / " + y + " = " + divide(x, y, quotient) );
									} 
										// trying to divide by 0 case 
									else System.out.println("Cannot divide by 0, Try again ");
						break;
							
							// default for undefined operator
						default :
							System.out.println("Undefined operator, Try again");
					}
			}					
	}
}
