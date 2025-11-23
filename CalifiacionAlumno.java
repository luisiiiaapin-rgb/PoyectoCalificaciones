public class CalificacionAlumno {
    // Atributos de la clase
    private String nombre;
    private double[] calificaciones = new double[5];

    // Constructor para inicializar los atributos
    public CalificacionAlumno(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        if (calificaciones.length == 5) {
            this.calificaciones = calificaciones;
        } else {
            System.out.println("Error: El array debe contener exactamente 5 calificaciones.");
        }
    }

    // Método 1: Calcula el promedio (recibe el array y regresa un double)
    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double cal : calificaciones) {
            suma += cal;
        }
        return suma / 5;
    }

    // Método 2: Obtiene la calificación final (recibe el promedio y regresa un char)
    public static char obtenerCalificacion(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    // Método 3: Imprime los resultados (recibe nombre, array de calificaciones, promedio y calificación; no regresa nada)
    // Nota: Agregué el array como parámetro para poder imprimir las calificaciones individuales, como se requiere en el formato.
    public static void imprimirResultados(String nombre, double[] calificaciones, double promedio, char calificacion) {
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Calificación 1: " + calificaciones[0]);
        System.out.println("Calificación 2: " + calificaciones[1]);
        System.out.println("Calificación 3: " + calificaciones[2]);
        System.out.println("Calificación 4: " + calificaciones[3]);
        System.out.println("Calificación 5: " + calificaciones[4]);
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }

    // Método main para probar la clase (ejemplo de uso)
    public static void main(String[] args) {
        // Ejemplo de datos
        String nombreEjemplo = "Juan Pérez";
        double[] calificacionesEjemplo = {85, 92, 78, 88, 95};

        // Crear instancia (aunque métodos son estáticos, se muestra para uso de atributos)
        CalificacionAlumno alumno = new CalificacionAlumno(nombreEjemplo, calificacionesEjemplo);

        // Calcular promedio
        double promedio = calcularPromedio(calificacionesEjemplo);

        // Obtener calificación
        char calificacion = obtenerCalificacion(promedio);

        // Imprimir resultados
        imprimirResultados(nombreEjemplo, calificacionesEjemplo, promedio, calificacion);
    }
}
