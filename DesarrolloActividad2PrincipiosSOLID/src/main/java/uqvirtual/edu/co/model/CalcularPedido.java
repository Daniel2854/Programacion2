package uqvirtual.edu.co.model;

public class CalcularPedido {
    private Pedido pedido;
    private IEstrategiaDescuento estrategia;

    public CalcularPedido(Pedido pedido, IEstrategiaDescuento estrategia) {
        this.pedido = pedido;
        this.estrategia = estrategia;
    }

    public double calcular() {
        double resultado = 0.0;
        for(Alimento a : pedido.getListaAlimento()) {
            resultado += a.getValor();
        }
        return resultado - estrategia.calcularDescuento(pedido);
    }
}
