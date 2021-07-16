import java.util.Scanner;
public class App {
    /* Escribe un programa que lea una cantidad de grados centígrados y la pase a
grados Fahrenheit. La fórmula es: F = 32 + ( 9 * C / 5)
    */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cantidad de grados Centígrados : ");
        int numero = sc.nextInt();

        var digito = numeroF(numero);
        System.out.println("En grados Fahrenheit es " + digito);


    }
    public static int numeroF(int numero){
        var F = 32 + (9*numero/5);
        // var F = numero * 9/5 + 32;
        return F; 

    }
    
}
