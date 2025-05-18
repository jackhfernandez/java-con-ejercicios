/**
 * Estructura de datos con shakmuria.
 * Programa: crear un arreglo con 5 elementos enteros y buscar uno de ellos
 */
package company;

import java.util.Scanner;

/**
 *
 * @author jackh
 */
public class App {

  // Scanner, MAX
  static Scanner scanner =  new  Scanner(System.in);
  static final int MAX = 5;
  
  public static void main(String[] args) {
    int num;
    int arreglo[] = {1, 4, 45, 67, 43};

  }

  static int ingresarNumero(int arreglo[]) {
    System.out.println("Buscar un numero\n");
    System.out.println("Ingrese el numero a buscar: ");
    int num1 = scanner.nextInt();
    return num1;
  }
}
