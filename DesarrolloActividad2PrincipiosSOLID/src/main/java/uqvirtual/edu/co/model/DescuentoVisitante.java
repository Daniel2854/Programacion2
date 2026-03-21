package uqvirtual.edu.co.model;

public class DescuentoVisitante implements IEstrategiaDescuento{

    public DescuentoVisitante() {}

    @Override
    public double calcularDescuento(Pedido pedido) {
        double resultado = 0.0;
        for(Alimento a : pedido.getListaAlimento()) {
            resultado += a.getValor() - a.getValor()*0.05;
        }
        return resultado;
    }
}
