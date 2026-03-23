package uqvirtual.edu.co.model.isp;

/*
    Esta interface representa el ejemplo correcto de Interface Segregation Principle
 */
public interface IGestionLibro {
    void registrarLibro(Libro libro);
    void eliminarLibro(Libro libro);
}
