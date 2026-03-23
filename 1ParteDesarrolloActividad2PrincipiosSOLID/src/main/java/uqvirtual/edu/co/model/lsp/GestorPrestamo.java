package uqvirtual.edu.co.model.lsp;


import java.util.ArrayList;

/*
    Esta Clase representa un mal ejemplo de Liskov Substitution Principle debido
    a que el método registrarPrestamo espera un Usuario pero internamente verifica el
    tipo concreto y lanza una excepción para Docente. Docente no puede sustituir a Usuario sin romper el programa.
 */
public class GestorPrestamo {
    private List<Prestamo> listaPrestamo;

    public GestorPrestamo() {
        listaPrestamo = new ArrayList<>();
    }

    // Para hacer un buen ejemplo simplemente hay que quitar la excepción
    public void registrarPrestamo(Prestamo prestamo) {
        if (usuario instanceof Docente) {
            throw new UnsupportedOperationException("Los docentes no pueden pedir libros");
        }
        this.listaPrestamo.add(prestamo);
    }
}
