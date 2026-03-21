package uqvirtual.edu.co.model;

import java.util.List;

public class GenerarRecomendacion {
    private IEstrategiaRecomendacion estrategia;

    public GenerarRecomendacion(IEstrategiaRecomendacion estrategia) {
        this.estrategia = estrategia;
    }

    public List<Alimento> generarRecomendacion() {
        return estrategia.recomendar();
    }
}
