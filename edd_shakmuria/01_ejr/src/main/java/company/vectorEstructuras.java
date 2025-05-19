/**
 * Vector estructuras
 */
package company;

import java.util.Scanner;

// 1. Declarar clase alumno
  class Alumno{
    // 2. Declarar atributos
    String codigo;
    String nombre;
    double nota;
  }  

/**
 *
 * @author jackh
 */
public class vectorEstructuras {
  
  // 3. Declarar static Scanner, MAX
  static Scanner sc = new Scanner(System.in);
  static final int MAX = 3;
  
  public static void main(String[] args) {
      
    // 4. Se declara el vector de tipo Alumno
    Alumno alumnos[] = new Alumno[MAX];
    
    // 5. Se declara elemento del vector 
    Alumno A1 = new Alumno();
  }
  
  // 6. Operaciones para un alumno
  static void llenarAlumno(Alumno A){
    System.out.print("CODIGO: ");
    A.codigo = sc.next();
    System.out.print("NOMBRE: ");
    A.nombre = sc.next();
    System.out.print("NOTA: ");
    A.nota = sc.nextInt();
  }
  
  // 7. Mostrar alumno
  static void mostrarAlumno(Alumno A){
    System.out.println(A.codigo + " - " + A.nombre + " - " + A.nota);
  }
  
  // 8. Operaciones para el vector alumno
  
}
