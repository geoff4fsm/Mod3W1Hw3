package Homework;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		char operator = ' ';
		while (operator != '#') {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter operation to be performed ( + , - , * , / ) or # to exit");
		System.out.println("here");
			operator = input.next().charAt(0);
			
			
		
			
		 switch ( operator ) {
			case '#' : 
				break;
			
			case '+' :				
				add();
				break;
				
			case '-' :
				subtract();
				break;
				
			case '*' :
				multiply();
				break;
				
			case '/' :
				divide();
				break;
				
			default :
				System.out.println("undefined operator");
			}
		 input.close();
		}

			
		}
public static void add() {
	double x, y;
	System.out.println("Enter numbers to be added ");
	Scanner input = new Scanner(System.in);
	
			x = input.nextDouble();
			System.out.println("bs");
			y = input.nextDouble();
			input.nextLine();
			double sum = x + y ;
			System.out.println(x + " + " + y + " = " + sum);
			input.close();
		}
public static void subtract() {
	double x,y;
	System.out.println("Enter numbers to be subtracted");
	Scanner input = new Scanner(System.in);
			x = input.nextDouble();
			y = input.nextDouble();
			
			double difference = x - y;
			System.out.println(x + " - " + y + " = " + difference);
			input.close();
		}
public static void multiply() {
	double x,y;
	System.out.println("Enter numbers to be multiplied");
	Scanner input = new Scanner(System.in);
			x = input.nextDouble();
			y = input.nextDouble();
			
			double product = x * y;
			System.out.println(x + " * " + y + " = " + product);
			input.close();
		}
public static void divide() {
	double x,y;
	System.out.println("Enter numbers to be divided");
	Scanner input = new Scanner(System.in);
			x = input.nextDouble();
			y = input.nextDouble();
			
			if ( y != 0 ) {
				double quotient = x / y;
				System.out.println(x + " / " + y + " = " + quotient);
			}
			else System.out.println("cannot divide by 0");	
			input.close();
	}
}

