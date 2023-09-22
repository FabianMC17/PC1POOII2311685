import java.util.*;

public class puntosPartido {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int puntosJuego = 0;
        int sumaPuntos = 0;
        
        try {
        System.out.println("Ingrese la cantidad de puntos que su equipo ha obtenido en cada juego de esta temporada.");
        System.out.println("Ingrese -1 cuando haya terminado.");
        
            while (puntosJuego != -1) {
                System.out.print("Introduce los puntos del juego o -1 para finalizar: ");
                puntosJuego = sc.nextInt();
                if (puntosJuego != -1){
                    sumaPuntos += puntosJuego;
                }
            }

            System.out.println("Los puntos totales son " + sumaPuntos);
            
        } catch (Exception e) {
            System.out.println("Programa finalizado, usted debe ingresar un numero valido.");
        }
    }
}
