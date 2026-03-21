package uqvirtual.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Alimento> listaAlimento;

    public Menu() {
        this.listaAlimento = new ArrayList<>();
    }

    public List<Alimento> getListaAlimento() {
        return listaAlimento;
    }

    public void actualizarMenu(List<Alimento> nuevaListaAlimento) {
        listaAlimento = nuevaListaAlimento;
    }
}
