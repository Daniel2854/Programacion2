package uqvirtual.edu.co.model.isp;


/*
    Esta interface representa un mal ejemplo de Interface Segregation Principle,
    una interfaz gigante obliga a todas las clases
    que la implementen a definir métodos que no necesitan.
    Por ejemplo GestorLibro no debería saber nada de préstamos ni usuarios,
    pero está obligado a implementar esos métodos.
 */
public interface IGestionBiblioteca {
    void registrarLibro(Libro libro);
    void eliminarLibro(Libro libro);
    void registrarUsuario(Usuario usuario);
    void eliminarUsuario(Usuario usuario);
    void registrarPrestamo(Prestamo prestamo);
    void devolverLibro(Prestamo prestamo);
    void generarReporte(ReportePrestamo reporte);
}
