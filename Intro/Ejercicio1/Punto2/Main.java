package Intro.Ejercicio1.Punto2;

public class Main {
    
    // Segunda parte:
    // Crear una clase coche.
    // Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
    // Una función que incremente el número de puertas que tiene el coche.
    // Crear un objeto miCoche en el main y añadirle una puerta.
    // Mostrar el número de puertas que tiene el objeto.

    public static void main(String[] args) {

        Coche miCoche = new Coche();

        miCoche.incrementarPuertas();

        int puertas = miCoche.puertas;

        System.out.println(puertas);
    }
}

class Coche {
    
    public int puertas = 0;

    public void incrementarPuertas() {
        this.puertas++;
    }


}