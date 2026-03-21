package uqvirtual.edu.co.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroOrden;
    private List<Alimento> listaAlimento;
    private Cliente cliente;
    private LocalDate fecha;

    public Pedido (int numeroOrden, Cliente cliente, LocalDate fecha) {
        this.numeroOrden = numeroOrden;
        this.listaAlimento = new ArrayList<>();
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public int getNumeroOrden() {
        return numeroOrden;
    }
    public List<Alimento> getListaAlimento() {
        return listaAlimento;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public LocalDate getFecha() {
        return fecha;
    }

    public void agregarAlimento(Alimento alimento) {
        this.listaAlimento.add(alimento);
    }

    public void eliminarAlimento(Alimento alimento) {
        this.listaAlimento.remove(alimento);
    }
}
