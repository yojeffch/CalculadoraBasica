/**
 * Esta es una calculadora básica que permite realizar operaciones aritméticas simples como suma, resta,
 * multiplicación y división entre dos números ingresados por el usuario. El programa le pregunta al usuario
 * si desea realizar otra operación después de cada operación realizada y se detiene solo cuando el usuario
 * ingresa "n" o "N" como respuesta.
 *
 * @author [JeffCh]
 * @version 1.0
 */
import java.util.Scanner;
public class CalculadoraJava {
    /**
     * Método principal que se encarga de ejecutar el programa.
     *
     * @param args los argumentos de línea de comando (no se usan en este programa).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            double numb1 = 0;
            double numb2 = 0;
            double resultados = 0;
            char operacion;

            System.out.println("Ingresa el primer numero");
            numb1 = input.nextDouble();
            System.out.println("Ingresa el segundo numero");
            numb2 = input.nextDouble();

            System.out.println("Ingrese la operación que desea realizar (+, -, *, /):");
            operacion = input.next().charAt(0);


            // Realizar la operación correspondiente
            switch (operacion) {
                case '+':
                    resultados = numb1 + numb2;
                    break;
                case '-':
                    resultados = numb1 - numb2;
                    break;
                case '*':
                    resultados = numb1 * numb2;
                    break;
                case '/':
                    resultados = numb1 / numb2;
                    break;
                default:
                    System.out.println("Operación inválida");
                    break;
            }

            // Imprimir el resultado
            System.out.println("El resultado es: " + resultados);

            // Preguntar si desea continuar
            System.out.println("¿Desea realizar otra operación? (S/N)");
            char continuarChar = input.next().charAt(0);
            if (continuarChar == 'N' || continuarChar == 'n') {
                continuar = false;
            }
        }

        input.close();
}
}
