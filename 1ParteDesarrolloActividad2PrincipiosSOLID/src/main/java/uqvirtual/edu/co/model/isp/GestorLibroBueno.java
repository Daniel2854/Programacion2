package uqvirtual.edu.co.model.isp;

public class GestorLibroBueno implements IGestionLibro{
    @Override
    public void registrarLibro(Libro libro) {
        System.out.println("Libro registrado: " + libro.getNombre());
    }
    @Override
    public void eliminarLibro(Libro libro) {
        System.out.println("Libro eliminado: " + libro.getNombre());
    }
}
