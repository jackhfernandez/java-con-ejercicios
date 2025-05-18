/**
 * Programa: Ingresar seis notas y mostrar las aprobatorias
 */
package company;

import static company.App.scanner;

/**
 *
 * @author jackh
 */
public class Ejr_02 {
  public static void main(String[] args) {
    double notas[] = new double[6];
    
    // Llamando funciones
    leerNotas(notas);
    verificarNotas(notas);
  }
  
  static void leerNotas(double notas[]){
    System.out.println("Ingresar notas \n");
    for (int i = 0; i < 6; i++) {
      do {
      System.out.print("Ingresar nota "+ (i+1)+ ": ");
      notas[i] = scanner.nextDouble();
      } while (notas[i] < 0 || notas[i]>10);
    }
  }
  
  static void verificarNotas(double notas[]){
    int contador=0;
    System.out.println("Notas aprobatorias: ");
    for (int i = 0; i < 6; i++) {
      if (notas[i] > 6 ){
        contador++;
        System.out.println(notas[i]);
      }
    }
    System.out.println("Usted tiene "+contador+" calificaciones aprobatorias");
  }
}
