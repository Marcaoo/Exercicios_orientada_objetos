package application;

import java.util.Locale;
import java.util.Scanner;


import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("What id the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought?  ");
		double amount = sc.nextDouble();
		
		double result = CurrencyConverter.dollarToReal(dollarPrice, amount);
		
		System.out.printf("Valor a ser pago em reais = %.2f%n", result);
		
		sc.close();
		
		
	}

}
