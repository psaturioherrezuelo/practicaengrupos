package pelea_de_dados;

public class Jugador {

    private String nombre;
    private int idJugador;
    private int nivel;
    private int pGanadas;
    private int pPerdidas;

public Jugador() {
    this.nombre="";
    this.idJugador=0;
    this.nivel=0;
    this.pGanadas=0;
    this.pPerdidas=0;
    }

public Jugador(String nombre, int idJugador, int nivel,int pPerdidas, int pGanadas) {
    this.nombre=nombre;
    this.idJugador=idJugador;
    this.nivel=nivel;
    this.pGanadas=pGanadas;
    this.pPerdidas=pPerdidas;
    }

//metodos getter and setter
public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre = nombre;
    }

public int getIdJugador(){
    return idJugador;

    }

public void setIdJugador(int idJugador){
    this.idJugador=idJugador;
    }

public int getNivel(){
    return nivel;
    }

public void setNivel(){
    this.nivel;
    }

public int getPGanadas(){
    return pGanadas;
    }

public void setPGanadas(int pGanadas){
    this.pGanadas=pGanadas;
}

public int getPPerdidas(){
    return pPerdidas;
    }

public void setPPerdida(int pPerdidas){
    this.pPerdidas=pPerdidas;
}
//Metodo ToString
public String toString(){
    return "Jugador: \t" + getNombre() + "\t id: " + getIdJugador() + "\t ganados: "+ getPGanadas() + "\t perdidos: " + getPPerdidas() + "\n";
    }
}
