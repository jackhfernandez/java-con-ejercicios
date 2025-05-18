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
  static Scanner scanner = new Scanner(System.in);
  static final int MAX = 5;

  public static void main(String[] args) {
    int arreglo[] = {1, 4, 45, 67, 43};

    // Llamando funcion
    buscar(arreglo);
  }

  static int ingresarNumero() {
    System.out.println("Buscar un numero");
    System.out.print("Ingrese numero a buscar o ingrese 0 para salir: ");
    int num1 = scanner.nextInt();
    return num1;
  }

  static void buscar(int arreglo[]) {
    boolean encontrado = false;
    int j=0, num1;
    do {
      num1 = ingresarNumero();
      for (int i = 0; i < MAX; i++) {
        j = i;
        if (arreglo[i]==num1) {
          encontrado = true;
          break;
        } else {
          encontrado = false;
        }
      }
      if (encontrado == true) {
        System.out.println("\nNumero "+num1+" encontrado en la posicion " + (j+1)+"\n");
      } else {
        System.out.println("\nNumero no encontrado\n");
      }
    } while (num1 != 0);
  }
}
