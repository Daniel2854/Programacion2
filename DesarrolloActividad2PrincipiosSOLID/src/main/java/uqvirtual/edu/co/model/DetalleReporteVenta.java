package uqvirtual.edu.co.model;

public class DetalleReporteVenta {
    private Pedido pedido;
    private double totalCalculado;

    public DetalleReporteVenta(Pedido pedido, double totalCalculado) {
        this.pedido = pedido;
        this.totalCalculado = totalCalculado;
    }

    public Pedido getPedido() {
        return pedido;
    }
    public double getTotalCalculado() {
        return totalCalculado;
    }
}
