package pelea_de_dados;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	    
		Jugador pers[] = new Jugador[2];
		
		System.out.println("¡ PELEA DE DADOS !\n\n"
				+ "Enfrentate a un amigo y haz una apuesta en una frenetica batalla de dados\n"
				+ "en la que cada jugador tirara 3 dados en cada ronda hasta dejar sin vida a su rival.");
		System.out.println("Te recomendamos encarecidamente ampliar la pantalla de la consola lo maximo que puedas.\n");
		
		crearjugs(pers);
		partida(pers);
		
	}
	
	private static void crearjugs(Jugador pers[]) { //Metodo para crear los jugadores
		
		
		Scanner sc = new Scanner(System.in);
		int num;
		String nombre;
		
		for(int i=0; i<pers.length; i ++) {
			
			num = i+1;
			System.out.print("Introduce el nombre del jugador " + num + ": ");
			nombre = sc.nextLine();
			
			pers[i]= new Jugador(num,nombre);
			System.out.println("¡Jugador " + nombre + " creado con exito!");
		}
		
		System.out.println("\nCargando partida...\n");
		timer();
		
	}

	private static void partida(Jugador[] pers) { //Ejecucion de la partida
		
		boolean win = false; //Fin del juego
		int dif, turnos = 0, vidas, tot, suma[] = new int[pers.length]; //Variables necesarias para los calculos
		
		do { //Bucle principal que estara activo hasta que pierda un jugador
			
			turnos ++;
			System.out.println("\n\nTurno " + turnos + "\n\n");
			suma = new int[pers.length]; //Array que acumulara la suma de ambos jugadores
			dif = 0;
			vidas = 0;
			tot = 0;
			
			/* Fase de tirada de dados acumulando el total en una variable */
			for(int i=0; i<pers.length; i++) {
				
				suma[i] = pers[i].tirarDado();
				timer();
				
			}
		
			System.out.println("El jugador " + pers[0].getIdJugador() + " " + pers[0].getNombre() + ": ha sacado " + suma[0]);
			System.out.println("El jugador " + pers[1].getIdJugador() + " " + pers[1].getNombre() + ": ha sacado " + suma[1]);
			
			/* Condicion que comprobara que jugador ha sacado mayor puntuacion */
			if(suma[0]>suma[1]) {
				
				dif=suma[0]-suma[1];
				vidas = pers[1].getVidas();
				tot = vidas - dif;
				System.out.println("El jugador " + pers[1].getIdJugador() + " " + pers[1].getNombre() + ": "
						+ "perdera: " + dif + " y se queda con un total de " + tot + " vidas.");
				pers[1].setVidas(tot);
				
			} else if(suma[0]<suma[1]) {
				
				dif=suma[1]-suma[0];
				vidas = pers[0].getVidas();
				tot = vidas - dif;
				System.out.println("El jugador " + pers[0].getIdJugador() + " " + pers[0].getNombre() + ": "
						+ "perdera: " + dif + " y se queda con un total de " + tot + " vidas.");
				pers[1].setVidas(tot);
				
			} else {
				
				System.out.println("Habeis sacado la misma suma");
				
			}
			
			timer();
			
			/* Condicion que comprobara si un jugador ha perdido */
			if(pers[0].getVidas() <= 0 || pers[1].getVidas() <= 0) {
				
				win = true;
				
				if(pers[0].getVidas()>pers[1].getVidas()) {
					
					System.out.println("\nGana " + pers[0].getNombre() + "!!!!!!!!!!!!!!!!\n");
				
				} else {
				
					System.out.println("\nGana " + pers[1].getNombre() + "!!!!!!!!!!!!!!!!\n");
				
				}
			
			}
			
		} while(win==false); //Fin del bucle principal
		
		System.out.println("La partida ha durado " + turnos + " turnos.\n"
				+ "\n¡Nos vemos en el proximo duelo a muerte!");
		
	}

	private static void timer() { //Temporizador para que no salga todo el codigo de golpe
		
		try {
			
			Thread.sleep(2000);//2 segundos
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		
		}
		
	}
	
}