package uqvirtual.edu.co.model;

public class DescuentoProfesor implements IEstrategiaDescuento{

    public DescuentoProfesor() {}

    @Override
    public double calcularDescuento(Pedido pedido) {
        double resultado = 0.0;
        for(Alimento a : pedido.getListaAlimento()) {
            resultado += a.getValor() - a.getValor()*0.10;
        }
        return resultado;
    }
}
