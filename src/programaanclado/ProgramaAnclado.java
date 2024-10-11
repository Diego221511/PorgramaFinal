package programaanclado;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProgramaAnclado {

    public static void main(String[] args) {
        
        boolean resultadoOR = or(true, true);
        System.out.println("Resultado OR: " + resultadoOR);
        
        String fechaHoraActual = obtenerFechaHoraActual();
        System.out.println("La fecha actual es: " + fechaHoraActual);

        
        
    }
    
    private static boolean or(boolean a, boolean b) {
        return a || b;
    }

    private static String obtenerFechaHoraActual() {
        LocalDateTime ahora = LocalDateTime.now();        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");        
        return ahora.format(formato);    
    }
    
}
