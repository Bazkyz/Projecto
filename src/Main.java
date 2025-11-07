import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main (String[] args){


        Scanner llegir = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;  // número entre 1 y 100
        int intento =0;
        int contador = 0;

        System.out.println("🎯 Adivina el número (entre 1 y 100):");

        do {
            //System.out.print("Introduce tu número: ");

            try {
                System.out.print("Introduce tu número: ");
                intento = llegir.nextInt();
            }catch (InputMismatchException e){
                llegir.nextLine();
                System.out.println("Intrudueix un numero no una paraula: ");


            }

            //BUFFER ES CUANDO UNAS LETRAS SE QUEDAN SIN GUARDAR EN NINGUN SITIO I LUEGO PONIENDOLO
            // EN UN ENTRADA DE TEXTO SE GUARDAN HAY




            contador++;

            if (intento < numeroSecreto) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else if (intento > numeroSecreto) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            } else {
                System.out.println("¡Correcto! 🎉 Has adivinado el número en " + contador + " intentos.");
            }

        } while (intento != numeroSecreto);

        System.out.println("Esto funciona");

        System.out.println("Segunda prueba")





    }
    }

