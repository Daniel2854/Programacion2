package uqvirtual.edu.co.model.dip;

import uqvirtual.edu.co.model.isp.IGestionLibro;

/*
    Esta clase representa correctamente un buen ejemplo de Dependency Inversion Principle,
    ahora la clase no depende de implementaciones concretas. Las implementaciones se inyectan
    desde fuera a través del constructor.
 */
public class BibliotecaBueno {
    private IGestionLibro gestorLibro;
    private IGestionUsuario gestorUsuario;
    private IGestionPrestamo gestorPrestamo;

    public BibliotecaBueno(IGestionLibro gestorLibro,
                      IGestionUsuario gestorUsuario,
                      IGestionPrestamo gestorPrestamo) {
        this.gestorLibro = gestorLibro;
        this.gestorUsuario = gestorUsuario;
        this.gestorPrestamo = gestorPrestamo;
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
