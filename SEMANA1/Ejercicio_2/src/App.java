import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");

        /* Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre : ");
        String nom = sc.nextLine();
        
        
        if (nom.equals("Anyeli")){
            System.out.println("Es correcto!"); 
        } else if (nom.equals("Anye")){
            System.out.println("No es correcto");
        } else {
            System.out.println("Ninguna de las anteriores");
        } */
        
        // Condicciones con IF 
        if (7 == 38){
            System.out.println("Es correcto"); 
        } else {
            System.out.println("No es correcto"); 
        }
        
        if ("a" != "k"){
            System.out.println("Es correcto"); 
        } else {
            System.out.println("No es correcto"); 
        }
        

        // Condicciones con Switch

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su valor : ");
        int valor_entero = sc.nextInt();
        String valor_texto = sc.nextLine();
        String respuesta = "";

        switch (valor_entero){
            case 1:
                //operación
                respuesta = "caso 1 correcto";
                break;
            case 2:
                //operación
                respuesta = "caso 2 correcto";
                break;
            default: 
                //operación
                respuesta = "ninguna de las anteriores";

        }
        System.out.println(respuesta);
        

    }


    
}

