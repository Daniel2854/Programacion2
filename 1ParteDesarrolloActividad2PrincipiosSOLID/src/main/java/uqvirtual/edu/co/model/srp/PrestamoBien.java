package uqvirtual.edu.co.model.srp;

import java.time.LocalDate;

/*
   Esta Clase representa un buen ejemplo de la aplicación de Single Responsibility Principle
   Prestamo solo tiene una responsabilidad, almacenar la información de un préstamo realizado.
   Si la lógica de historial cambia, esta clase no se ve afectada.
    */
public class PrestamoBien {
    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaInicio;
    private LocalDate fechaDevolucion;

    public PrestamoMal(Libro libro, Usuario usuario, LocalDate fechaInicio, LocalDate fechaDevolucion) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Libro getLibro() {
        return libro;
    }
    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaDevolucion(LocalDate fechaDevolucion) {
            this.fechaDevolucion = fechaDevolucion;
        }
}
