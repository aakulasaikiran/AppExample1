import java.util.Scanner;
//Import a static variable
import static java.lang.System.out;
import static java.lang.System.err;


public class Calc {
	
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		while ( true ){
			printDetails();
			double f = promptNumber(sc, "Enter your first number: ");
			char c = promptOperator(sc, "Enter an operator: ");
			double s = promptNumber(sc, "Enter your second number: ");
			
			//Get the total
			double tot = calculate(c, f, s);
			System.out.println("\n Total: " + tot + "\n");
			
			System.out.print("press 'q' to quit or 'c' to continue with the new calculation: ");
			try {
				char option = (char)System.in.read();
				if (option=='q'||option=='Q') break;
			}
			catch(Exception ex){
				err.println("Error reading the option!");
			}
			
		}
		
	}
	
	static final char []OPS = {'+', '-', '*', '/'};
	
	static double calculate(char op, double f, double s){
		
		switch( op ){
			case '+': return f + s;
			case '-': return f - s;
			case '*': return f * s;
			case '/': return f / s;
		}
		
		//Hopefully should never reach here
		return 0;
	}
	
	static char promptOperator(Scanner sc, String msg){
		
		char result = '=';
		
		while (true){
			out.print(msg);
			String line = sc.nextLine().trim();
			//Check if it's a valid operator
			if (!line.isEmpty()){
				char op = line.charAt(0);
				boolean valid = false;
				for (char c : OPS){
					if (c == op){
						valid = true;
						break;
					}
				}
				if (!valid){
					err.println("Invalid number!");
					continue;
				}
				result = op;
			} else {
				out.println("Your didn't enter anything! What's wrong with you bro");
				continue;
			}
			break;
		}
		return result;
	}
	
	//Prompts the user for a number. If the user enters an invalid number, it makes him/her reenter the number
	static double promptNumber(Scanner sc, String msg){
		double value = 0;
		while (true){
			out.print(msg);
			try {
				String line = sc.nextLine();
				value = Double.parseDouble(line);
			}
			catch(Exception ex){
				System.err.println("Your didnt enter a valid number!");
				continue;
			}
			break;
		}
		return value;
	}
	
	static void printDetails(){
		out.println("\n-----------JAVA CONSOLE CALCULATOR PROGRAM -----------\n");
		out.println(" * to multiply\n / to divide\n + to add\n - to subtract\n");
	}
}