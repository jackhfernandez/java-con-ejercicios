package s03;

/**
 * Lectura de datos desde teclado
 *
 * @author jackh
 */
public class DimeTuNombre {
  public static void main(String[] args) {
    String nombre;
    System.out.println("Por favor, dime como te llamas: ");
    nombre = System.console().readLine();
    System.out.println("Hola " + nombre + ", encantado de conocerte!");
  }
}
