package uqvirtual.edu.co.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GenerarReporteVenta {
    private List<DetalleReporteVenta> listaDetalle;

    public GenerarReporteVenta() {
        this.listaDetalle = new ArrayList<>();
    }

    public List<DetalleReporteVenta> getListaDetalle() {
        return listaDetalle;
    }

    public void agregarDetalle(DetalleReporteVenta detalle) {
        this.listaDetalle.add(detalle);
    }

    public List<DetalleReporteVenta> generarReporteDiario(LocalDate fecha) {
        List<DetalleReporteVenta> resultado = new ArrayList<>();
        for(DetalleReporteVenta d: listaDetalle) {
            if(d.getPedido().getFecha().equals(fecha)) {
                resultado.add(d);
            }
        }
        return resultado;
    }
}