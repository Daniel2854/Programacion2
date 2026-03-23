package uqvirtual.edu.co.model.isp;

public class GestorLibro implements IGestionBiblioteca{
    @Override
    public void registrarLibro(Libro libro) {
        System.out.println("Libro registrado: " + libro.getNombre());
    }
    @Override
    public void eliminarLibro(Libro libro) {
        System.out.println("Libro eliminado: " + libro.getNombre());
    }
    @Override
    public void registrarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("GestorLibro no gestiona usuarios"); // ❌
    }
    @Override
    public void eliminarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("GestorLibro no gestiona usuarios"); // ❌
    }
    @Override
    public void registrarPrestamo(Prestamo prestamo) {
        throw new UnsupportedOperationException("GestorLibro no gestiona préstamos"); // ❌
    }
    @Override
    public void devolverLibro(Prestamo prestamo) {
        throw new UnsupportedOperationException("GestorLibro no gestiona devoluciones"); // ❌
    }
    @Override
    public void generarReporte(ReportePrestamo reporte) {
        throw new UnsupportedOperationException("GestorLibro no genera reportes"); // ❌
    }
}
