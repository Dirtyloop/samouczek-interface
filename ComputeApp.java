package computePackage;

import java.util.Scanner;

public class ComputeApp {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ComputeApp main = new ComputeApp();
		Computation computation;

		if (main.shouldMultiply()) {
			computation = new Multiplication(); // zaimplementuj brakujaca klase
		} else {
			computation = new Addition(); // zaimplementuj brakujaca klase
		}

		double argument1 = main.getArgument();
		double argument2 = main.getArgument();

		double result = computation.compute(argument1, argument2);
		System.out.println("Wynik " + computation.myOperation() + ": " + result);

		// scan.close();
	}

	private boolean shouldMultiply() {

		String input = "";

		while (!(input.equals("d") || input.equals("m"))) {
			System.out.println("Wcisnij 'm' dla mnozenia lub 'd' dla dodawania... ");
			input = getUserInput();
			if (input.equals("d")) {
				return false;
			}

		}
		return true;
		// tutaj zapytaj uzytkownika co chce zrobic (mnozenie czy dodawanie)
	}

	private double getArgument() {
		double userInput = 0;
		boolean isDouble = true;
		do {
			try {

				System.out.println("Podaj liczbe double: ");
				userInput = Double.parseDouble(getUserInput());
				isDouble = true;

			} catch (Exception e) {

				System.out.println("Bledny format!");
				isDouble = false;
			}
		} while (!isDouble);
		return userInput; // tutaj pobierz liczbe od uzytkownika

	}
	
	public static String getUserInput() {
		return scan.nextLine().trim();
	}

}
