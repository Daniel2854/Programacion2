package uqvirtual.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class RegistroCliente {
    private List<Cliente> listaCliente;

    public RegistroCliente() {
        this.listaCliente = new ArrayList<>();
    }

    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void registrarCliente(Cliente cliente) {
        this.listaCliente.add(cliente);
    }

    public Cliente buscarCliente(String nombre) {
        for (Cliente cliente : listaCliente) {
            if(cliente.getNombre().equalsIgnoreCase(nombre)) {
                return cliente;
            }
        }
        return null;
    }

    public void eliminarCliente(String nombre) {
        Cliente aux = buscarCliente(nombre);
        if (aux != null) {
            this.listaCliente.remove(aux);
        }
    }
}
