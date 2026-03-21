package uqvirtual.edu.co.model;

public class Cafeteria {
    private String nombre;
    private Menu menu;
    private RegistroCliente gestorCliente;
    private GestorPedido gestorPedido;
    private GenerarReporteVenta generarReporte;
    private GestorHistorial gestorHistorial;

    public Cafeteria(String nombre, Menu menu, RegistroCliente gestorCliente, GestorPedido gestorPedido,
                     GenerarReporteVenta generarReporte, GestorHistorial gestorHistorial) {
        this.nombre = nombre;
        this.menu = menu;
        this.gestorCliente = gestorCliente;
        this.gestorPedido = gestorPedido;
        this.generarReporte = generarReporte;
        this.gestorHistorial = gestorHistorial;
    }

    public String getNombre() {
        return nombre;
    }
    public Menu getMenu() {
        return menu;
    }
    public GestorPedido getGestorPedido() {
        return gestorPedido;
    }
    public RegistroCliente getGestorCliente() {
        return gestorCliente;
    }
    public GenerarReporteVenta getGenerarReporte() {
        return generarReporte;
    }
    public GestorHistorial getGestorHistorial() {
        return gestorHistorial;
    }
}
