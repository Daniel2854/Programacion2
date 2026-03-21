package uqvirtual.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class Historial {
    private int codigo;
    private Cliente cliente;
    private List<Pedido> listaPedido;

    public Historial (int codigo, Cliente cliente) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.listaPedido = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public List<Pedido> getListaPedido() {
        return listaPedido;
    }

    public void agregarPedido (Pedido pedido) {
        this.listaPedido.add(pedido);
    }
}
