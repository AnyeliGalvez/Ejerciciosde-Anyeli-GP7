import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;



public class App {
    /**
     * sintaxis del lenguaje de Java
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        int i = 1;

        //System.out.println("Hola, mundo !");
    
    // Es un comentario p0ara una lista de código
    /*
    este es un comentario para un bloque del código
    comentar varias líneas de código
    */

    int x = 0;
    String nombre = "Angel";
    double a = 3.4;
    boolean bNuevo = true;
    int[] datos; 
    /*
    var ejemplo = "ejemplo"; 
    // var b;
    System.out.println("Hola, \t mundo !");
    System.out.println("Hola, \b mundo");
    System.out.println("Hola, \n mundo");
    System.out.println("Hola, \r mundo");
    System.out.println("Hola, \f mundo");
    System.out.println("\'Hola, mundo\'"); 

    var anho_nacimiento = 45;
    // var public = 1
    */

    Scanner sc = new Scanner(System.in);
    System.out.println("Por favor ingrese su nombre");
    String nombreEntrada = sc.nextLine();
    System.out.println("Su nombre es " + nombreEntrada);


    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Por favor ingrese su nombre");
    String nombre_br = br.readLine();
    System.out.println("Su nombre es " + nombre_br);

    


    }
}
