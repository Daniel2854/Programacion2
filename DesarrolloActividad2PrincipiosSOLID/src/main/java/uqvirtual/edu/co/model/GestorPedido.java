package uqvirtual.edu.co.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorPedido {
    private List<Pedido> listaPedido;

    public GestorPedido() {
        this.listaPedido = new ArrayList<>();
    }

    public List<Pedido> getListaPedido() {
        return listaPedido;
    }

    public void registrarPedido(Pedido pedido) {
        this.listaPedido.add(pedido);
    }

    public void eliminarPedido(Pedido pedido) {
        this.listaPedido.remove(pedido);
    }

    public Pedido buscarPedido(int numeroOrden) {
        for (Pedido pedido : listaPedido) {
            if(pedido.getNumeroOrden() == numeroOrden) {
                return pedido;
            }
        }
        return null;
    }

    public void actualizarPedido(Pedido pedido) {
        Pedido aux = buscarPedido(pedido.getNumeroOrden());
        if (aux != null) {
            this.listaPedido.remove(aux);
            this.listaPedido.add(pedido);
        }
    }

    public List<Pedido> obtenerPedidosPorCliente(Cliente cliente) {
        ArrayList<Pedido> resultado = new ArrayList<>();
        for (Pedido p: listaPedido){
            if(p.getCliente().equals(cliente)) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public List<Pedido> obtenerPedidosPorFecha(LocalDate fecha) {
        ArrayList<Pedido> resultado = new ArrayList<>();
        for (Pedido p: listaPedido){
            if(p.getFecha().equals(fecha)) {
                resultado.add(p);
            }
        }
        return resultado;
    }
}
