import java.util.Scanner;

public class Calculadora {

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el primer número
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        // Pedir el segundo número
        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        // Pedir la operación
        System.out.print("Introduce la operación a realizar (suma/resta): ");
        String operacion = scanner.next();

        if (operacion.equalsIgnoreCase("suma")) {
            suma(num1, num2);
        } else if (operacion.equalsIgnoreCase("resta")) {
            resta(num1, num2);
        } else {
            System.out.println("Operación no válida. Por favor, elige 'suma' o 'resta'.");
        }

        scanner.close();
    }

    // Función para realizar la suma
    public static void suma(double a, double b) {
        double resultado = a + b;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    // Función para realizar la resta
    public static void resta(double a, double b) {
        double resultado = a - b;
        System.out.println("El resultado de la resta es: " + resultado);
    }

}

