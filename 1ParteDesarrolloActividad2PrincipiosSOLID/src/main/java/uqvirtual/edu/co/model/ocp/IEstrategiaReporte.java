package uqvirtual.edu.co.model.ocp;


/*
   Con esta interface se crea un buen ejemplo de open closed principle. Para agregar
   un nuevo tipo de reporte solo se crea una clase nueva sin tocar nada existente.
 */
public interface IEstrategiaReporte {
    void generar(ReportePrestamo reporte);
}
