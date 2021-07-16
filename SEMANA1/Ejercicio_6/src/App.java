import java.util.Scanner;

public class App {
    /*Escribe un programa Java que lee un número entero por teclado y obtiene y
muestra por pantalla el doble y el triple de ese número. */
    public static void main(String[] args) throws Exception {
         // También se puede usar var (reemplazar var por scanner)
        // Creamos el objeto para pedir el dato numérico.
        Scanner sc = new Scanner(System.in);
        // Impresión por consola con la clase System.
        System.out.println("Ingrese un número entero : ");
        // Asignamos a una variable número el valor ingresado por teclado.
        int numero = sc.nextInt();

        // Impresión de las funciones separadas numeroDoble y numeroTriple.
        System.out.println("El doble de " + numero + " es : " + numeroDoble(numero));
        System.out.println("El triple de " + numero + " es : " + numeroTriple(numero));
        // Impresión de la función numeroRespuesta, que retorna un String (cadena de caracteres).
        System.out.println(numeroRespuesta(numero));

    }

    public static int numeroDoble(int numero){
        return numero*2;
    }

    public static int numeroTriple(int numero){
        return numero*3;
    }
    
    public static String numeroRespuesta(int numero){
        return "El doble de " + numero + " es : " + (numero*2) + "\nEl triple de " + numero + " es : " + (numero*3); 
    }
        
    


}
