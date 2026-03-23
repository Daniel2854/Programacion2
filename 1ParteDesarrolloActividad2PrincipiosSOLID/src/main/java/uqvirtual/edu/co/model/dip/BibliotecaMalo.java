package uqvirtual.edu.co.model.dip;

import uqvirtual.edu.co.model.lsp.GestorPrestamo;

/*
    Esta clase representa un mal ejemplo de Dependency Inversion Principle,
    crea directamente las implementaciones concretas.
 */
public class BibliotecaMalo {
    private GestorLibro gestorLibro;
    private GestorUsuario gestorUsuario;
    private GestorPrestamo gestorPrestamo;

    public BibliotecaMalo() {
        this.gestorLibro = new GestorLibro();
        this.gestorUsuario = new GestorUsuario();
        this.gestorPrestamo = new GestorPrestamo();
    }

    public void registrarLibro(Libro libro) {
        gestorLibro.registrarLibro(libro);
    }
    public void registrarUsuario(Usuario usuario) {
        gestorUsuario.registrarUsuario(usuario);
    }
    public void registrarPrestamo(Prestamo prestamo) {
        gestorPrestamo.registrarPrestamo(prestamo);
    }

}
