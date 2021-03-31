package pelea_de_dados;

public class Main {

	public static void main(String[] args) {
    
		// esto jugador es de prueba para probar la clase jugador
//		Jugador pablo = new Jugador("pablo",100,2,3,5);
//		System.out.println(pablo);
   
		/* Prueba jugador con vidas y dados */
		String nombre;
		int id, cantplayers = 2, total;
		Jugador player[] = new Jugador[cantplayers];
		
		for(int i=0; i<cantplayers; i++) {
			
			id = i+1;
			System.out.println("Introduce el nombre del jugador " + id);
			
			if(i==0) { //condicion para tener nombres temporalmente, solo para pruebas
				nombre = "carlos";
			} else {
				nombre = "angel";
			}
			
			player[i] = new Jugador(id,nombre);
			
			System.out.println(player[i]);
			total=player[i].tirarDado();//dar un valor a la suma total de los dados de cada jugador
			System.out.println(total);
		
		}
		
	}

}
