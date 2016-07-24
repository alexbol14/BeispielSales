package com.alexbol.beispielsales;

public class Main {

	public static void main(String[] args) {
		SalesData data = new SalesData();

		displayGreeting();
		data.display();

	}

	public static void displayGreeting() {
		System.out.println("Hallo");
	}
}
