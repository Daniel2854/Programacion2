package uqvirtual.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class RegistroAlimento {
    private List<Alimento> listaAlimento;

    public RegistroAlimento() {
        this.listaAlimento = new ArrayList<>();
    }

    public List<Alimento> getListaAlimento() {
        return listaAlimento;
    }

    public void agregarAlimento(Alimento alimento) {
        this.listaAlimento.add(alimento);
    }

    public void eliminarAlimento(Alimento alimento) {
        this.listaAlimento.remove(alimento);
    }

    public Alimento buscarPorCodigo(int codigo) {
        for(Alimento alimento: listaAlimento) {
            if(alimento.getCodigo() == codigo) {
                return alimento;
            }
        }
        return null;
    }

    public void editarAlimento(int codigo, String nombre, double valor) {
        Alimento aux = buscarPorCodigo(codigo);
        if (aux != null) {
            aux.setNombre(nombre);
            aux.setValor(valor);
        }
    }

    public void sincronizarMenu(Menu menu) {
        menu.actualizarMenu(this.listaAlimento);
    }
}
