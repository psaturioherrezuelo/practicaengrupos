package pelea_de_dados;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    
		// esto jugador es de prueba para probar la clase jugador
//		Jugador pablo = new Jugador("pablo",100,2,3,5);
//		System.out.println(pablo);
   
		/* Prueba jugador con vidas y dados */
		String nombre;
		int id, cantplayers = 2, total;
		Jugador player[] = new Jugador[cantplayers];
		Scanner ent = new Scanner(System.in);
		boolean fin= false;
		
		for(int i=0; i<cantplayers; i++) {
			
			id = i+1;
			System.out.println("Introduce el nombre del jugador " + id);
			nombre = ent.next();
			
		
			
			
			player[i] = new Jugador(id,nombre);
			
			System.out.println(player[i]);
			
		
		}
		do {
			for(int i=0; i<player.length; i++) {
				player[i].tirarDado();
			}
			if(player[0].getTotal()>player[1].getTotal()) {
				player[1].setVidas(player[0].getTotal()-player[1].getTotal());
			}else if(player[0].getTotal()<player[1].getTotal()) {
				player[0].setVidas(player[1].getTotal()-player[0].getTotal());
				
			}else {
				System.out.println("Habéis empatado");
			}
			
			for(int j=0; j<player.length; j++) {
				System.out.println("Jugador " + j + " " + player[j].getVidas());
				if(player[j].getVidas() <= 0) {
					fin=true;
					System.out.println("Jugador " + j + "pierde");
				}
			}
			
		}while(fin==true);
		
	}

}
