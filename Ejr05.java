/*
  Mostrando Horario de clase con colores por curso
  Fernandez
*/

public class Ejr05 {
  public static void main(String[] args) {
    System.out.println("\n\tHorario de clase Fernandez\n");
    System.out.println("┌────────┬───────────┬────────────┬───────────┬───────────┬─────────┐");
    System.out.println("│ \033[92m Hora  │   Lunes   │   Martes   │ Miercoles │  Jueves   │ Viernes \033[39;49m│");
    System.out.println("├────────┼───────────┼────────────┼───────────┼───────────┼─────────┤");
    System.out.print  ("│ 7:00 - │\033[94m Fundament \033[39;49m│\033[95m");
    System.out.print("Herramien  \033[39;49m │\033[33m Libre  \033[39;49m   ");
    System.out.println("│\033[94m Fundament \033[39;49m│\033[93m Comuni \033[39;49m │");
    System.out.print  ("│ 10:00  │\033[94m Programac \033[39;49m│\033[95m ");
    System.out.print("Digitales \033[39;49m │           │\033[94m Programac ");
    System.out.println("\033[39;49m│\033[93m cacion \033[39;49m │");
    System.out.println("├────────┼───────────┼────────────┼───────────┼───────────┼─────────┤");
    System.out.print  ("│ 10:00- │\033[93m Comuni  \033[39;49m  │\033[96m Logica");
    System.out.println("   \033[39;49m  │\033[33m Libre   \033[39;49m  │\033[91m Catedra  \033[39;49m │ Pensami │");
    System.out.print  ("│ 12:30  │\033[93m cacion  \033[39;49m  │\033[96m Simbolica ");
    System.out.println("\033[39;49m │           │\033[91m UNPRG   \033[39;49m  │ Filoso  │");
    System.out.println("├────────┼───────────┼────────────┼───────────┼───────────┼─────────┤");
    System.out.print("│ 12:30- │\033[36m Ciudadani \033[39;49m│\033[91m Catedra");
    System.out.println(" \033[39;49m   │\033[96m Logica \033[39;49m   │\033[33m Libre  \033[39;49m   │\033[36m Ciudad \033[39;49m │");
    System.out.print ("│  2:10  │\033[36m y Democra \033[39;49m│\033[91m UNPRG");
    System.out.println("   \033[39;49m   │\033[96m Simbolica \033[39;49m│           │\033[36m y Demo \033[39;49m │");
    System.out.print("└────────┴───────────┴────────────┴───────────┴───────────┴─────────┘");

  }
}
