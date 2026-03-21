package uqvirtual.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class AlimentoCombo extends Alimento{

    private List<Alimento> listaAlimento;

    public AlimentoCombo(int codigo, double valor, String nombre, TipoAlimento tipo) {
        super(codigo, valor, nombre, tipo);
        this.listaAlimento = new ArrayList<>();
    }

    public List<Alimento> getListaAlimento() {
        return listaAlimento;
    }

    public void reemplazarAlimento(Alimento viejo, Alimento nuevo) {
        int index = this.listaAlimento.indexOf(viejo);
        if (index != -1) {
            this.listaAlimento.set(index, nuevo);
        }
    }

    public void agregarAlimentoCombo(Alimento alimento) {
        this.listaAlimento.add(alimento);
    }
}
