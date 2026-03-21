package uqvirtual.edu.co.model;

public class DescuentoEstudiante implements IEstrategiaDescuento{

    public DescuentoEstudiante() {}

    @Override
    public double calcularDescuento(Pedido pedido) {
        double resultado = 0.0;
        for(Alimento a : pedido.getListaAlimento()) {
            resultado += a.getValor() - a.getValor()*0.20;
        }
        return  resultado;
    }
}
