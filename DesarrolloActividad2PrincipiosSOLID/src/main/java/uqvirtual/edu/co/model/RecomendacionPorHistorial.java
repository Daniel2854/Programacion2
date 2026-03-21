package uqvirtual.edu.co.model;

import java.util.List;

public class RecomendacionPorHistorial implements IEstrategiaRecomendacion{

    private Historial historial;

    public RecomendacionPorHistorial(Historial historial) {
        this.historial = historial;
    }

    @Override
    public List<Alimento> recomendar() {
        return historial.getListaPedido().getFirst().getListaAlimento();
    }
}
