package pelea_de_dados;

public class Main {

	public static void main(String[] args) {
    
		// esto jugador es de prueba para probar la clase jugador
		Jugador pablo = new Jugador("pablo",100,2,3,5);
		System.out.println(pablo);
		
    /*Prueba de los dados*/
		Dados dado = new Dados();
		System.out.println(dado);
   
	}

}
