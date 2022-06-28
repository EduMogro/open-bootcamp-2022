package Intro.Ejercicio2;

public class Main {

/*
    En este ejercicio practicarás las estructuras de control, para ello deberás crear:

    Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
    Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
    
    Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea 
    inferior a 3, el bloque de código que tendrá el bucle deberá:
        Incrementar el valor de la variable en uno cada vez que se ejecute.
        Mostrarlo por pantalla cada vez que se ejecute.
    Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe
        ejecutar una vez.
    Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición 
        será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que 
        se ejecute y deberá mostrarse por pantalla.
    Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro 
        estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje 
        por consola informando de la estación en la que está. También habrá que poner un default para 
        cuando el valor de la variable no sea una estación.
 */
    public static void main(String[] args) {
        
        int numeroIf = 0;
        System.out.print("numeroIf es ");
        if (numeroIf > 0)
            System.out.println("negativo.");
        else if (numeroIf < 0)
            System.out.println("positivo.");
        else 
            System.out.println("cero.");

        System.out.println("");
        System.out.println("Bucle While:");
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        System.out.println("");
        System.out.println("Bucle Do While:");
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);

        System.out.println("");
        System.out.println("Bucle For:");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        System.out.println("");
        System.out.println("Bloque Switch:");
        String estacion = "Inviernos";
        System.out.print("La estación es ");
        switch (estacion) {
            case "Verano":
                System.out.println("Verano");
                break;        
            case "Otoño":
                System.out.println("Otoño");
                break;        
            case "Invierno":
                System.out.println("Invierno");
                break;        
            case "Primavera":
                System.out.println("Primavera");
                break;        
            default:
                System.out.println("incorrecta");
                break;
        }
    }
}
