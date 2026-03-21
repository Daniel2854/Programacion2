package uqvirtual.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class GestorHistorial {
    private List<Historial> listaHistorial;

    public GestorHistorial() {
        this.listaHistorial = new ArrayList<>();
    }

    public List<Historial> getListaHistorial() {
        return listaHistorial;
    }

    public Historial obtenerHistorialPorCliente(Cliente cliente) {
        for(Historial h: listaHistorial) {
            if(h.getCliente().equals(cliente)) {
                return h;
            }
        }
        return null;
    }

    public void actualizarHistorial(Cliente cliente, Pedido pedido) {
        Historial aux = obtenerHistorialPorCliente(cliente);
        if (aux != null) {
            aux.agregarPedido(pedido);
        }
    }
}
