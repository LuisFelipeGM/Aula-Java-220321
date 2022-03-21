package br.com.fiap;

import java.util.Scanner;

public class UsaTelevisor {
	public static void main(String[] args) {
		Televisor tv1 = new Televisor();
		
		/*
		tv1.canal = 15;
		tv1.volume = 7;
		tv1.aumentarVolume();
		tv1.aumentarVolume();
		tv1.aumentarVolume();
		tv1.diminuirVolume();
		tv1.trocarCanal(4);
		tv1.mostrar(); */
		
		Scanner scan;
		int canal = 0, volume = 0;
		try {
			
			scan = new Scanner(System.in);
			System.out.println("Escolha um canal");
			canal = scan.nextInt();
			System.out.println("Escolha o volume");
			volume = scan.nextInt();
			tv1.trocarCanal(canal);
			tv1.volume = volume;
			tv1.mostrar();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
