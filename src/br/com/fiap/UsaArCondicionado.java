package br.com.fiap;

import java.util.Scanner;

public class UsaArCondicionado {
	public static void main(String[] args) {
		ArCondicionado ac1 = new ArCondicionado();
		
		/*
		ac1.temperatura= 20;
		ac1.modo = "Turbo";
		ac1.aumentarTemperatura();
		ac1.aumentarTemperatura();
		ac1.diminuirTemperatura();
		ac1.trocarModo("Frezze");
		
		ac1.mostrar(); */
		
		Scanner scan;
		int temperatura = 0;
		String modo = "default";
		try {
			
			scan = new Scanner(System.in);
			System.out.println("Digite a Temperatura desejada: ");
			temperatura = scan.nextInt();
			System.out.println("Escreva o Modo desejado: ");
			modo = scan.next();
			
			ac1.trocarModo(modo);
			ac1.temperatura = temperatura;
			ac1.mostrar();
			
		} catch (Exception e) {
			System.out.println("Formato Invalido!");
		}
	}
}
