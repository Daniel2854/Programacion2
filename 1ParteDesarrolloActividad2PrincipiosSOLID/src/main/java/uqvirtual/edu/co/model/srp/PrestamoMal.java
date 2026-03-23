package uqvirtual.edu.co.model.srp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/*
    Esta Clase representa un mal ejemplo de la aplicación de Single Responsibility Principle
 */
public class PrestamoMal {

    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaInicio;
    private LocalDate fechaDevolucion;
    private List<Historial> listaHistorial;

    public PrestamoMal(Libro libro, Usuario usuario, LocalDate fechaInicio, LocalDate fechaDevolucion) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaDevolucion = fechaDevolucion;
        this.listaHistorial = new ArrayList<>();
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
    public List<Historial> getListaHistorial() {
        return listaHistorial;
    }

    /*
            El problema radica en que Prestamo solo debería ser una clase contenedora de información,
            al encargarse de gestionar parcialmente los historiales se rompe el principio de responsabilidad
            única, el cual define que una Clase solo debe tener una razón de cambio, la clase prestamo se está encargando
            de gestión de historiales y almacenamiento de datos del prestamo realizado, esas son dos responsabilidades.
         */
    public void registrarHistorial(Historial historial) {
        this.listaHistorial.add(historial);
    }

    public void actualizarHistorial(Usuario usuario, PrestamoMal prestamo) {
        for (Historial h: listaHistorial) {
            if(h.getUsuario().equals(usuario)) {
                h.getListaPrestamos().add(prestamo);
            }
        }
    }
}
