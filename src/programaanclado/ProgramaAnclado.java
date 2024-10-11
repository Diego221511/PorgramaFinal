package programaanclado;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProgramaAnclado {

    public static void main(String[] args) {
        
        boolean resultadoOR = or(true, true);
        System.out.println("Resultado OR: " + resultadoOR);
        
        String fechaHoraActual = obtenerfechaHoraActual();
        System.out.println("La fecha actual es: " + fechaHoraActual);
        
        Persona persona = new Persona("Diego", 20,22151167);
        persona.mostrarDetalles();
        persona = null;
        System.gc();
        System.out.println("Fin del programa.");
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

class Persona {
    public String nombre;
    public int edad;
    public int numeroControl;
  
    public Persona(String nombre, int edad, int numeroControl) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroControl = numeroControl;
        System.out.println("Persona creada: " + nombre + ", " + edad + " años, y su numero de control:"
                + numeroControl);
    }
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Numero de control: " + numeroControl);
    }
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("El objeto de la persona " + nombre + "de edad:  " + edad + 
                    "y su numero de control: " + numeroControl);
            System.out.println("Finalizo");
            System.out.println("Hola esto es una pruba de git");
        } finally {
            super.finalize();
        }
    }
}
