package br.com.fiap;

public class UsaTelevisor {
	public static void main(String[] args) {
		Televisor tv1 = new Televisor();
		tv1.canal = 15;
		tv1.volume = 7;
		tv1.aumentarVolume();
		tv1.aumentarVolume();
		tv1.aumentarVolume();
		tv1.diminuirVolume();
		tv1.trocarCanal(4);
		
		tv1.mostrar();
	}
}
