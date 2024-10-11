/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaanclado;



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProgramaAnclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean resultadoOR = or(true, true);
        System.out.println("Resultado OR: " + resultadoOR);
        
        String fechaHoraActual = obtenerfechaHoraActual();
        System.out.println("La fecha actual es: " + fechaHoraActual);
        System.out.println("Hola, prueba 2");
    }

    public static boolean or(boolean a, boolean b) {
        return a || b;
    }

    private static String obtenerfechaHoraActual() {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return ahora.format(formato);

    }
    
    }
