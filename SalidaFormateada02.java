/*
  Salida formateada con numeros y cadenas de texto
  Fernandez
*/

public class SalidaFormateada02 {
  public static void main(String[] args) {
    System.out.println(" Articulo      Precio/Caja    Nro cajas");
    System.out.println("----------------------------------------");
    System.out.printf("%-10s    %8.2f        %6d\n", "manzanas", 4.5, 10);
    System.out.printf("%-10s    %8.2f        %6d\n", "peras", 2.75, 120);
    System.out.printf("%-10s    %8.2f        %6d\n", "aguacates", 10.0, 6);
  }
}
