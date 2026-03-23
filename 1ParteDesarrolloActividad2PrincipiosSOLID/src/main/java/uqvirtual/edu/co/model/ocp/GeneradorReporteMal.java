package uqvirtual.edu.co.model.ocp;

/*
    Esta Clase representa un mal ejemplo de Open Closed Principle, cada vez que se
    agregue un nuevo tipo de reporte hay que entrar a modificar este método.
    Además ignora ReportePrestamo que es el modelo correcto del sistema.
 */
public class GeneradorReporteMal {
    private Prestamo prestamo;

    public GeneradorReporteMal(Prestamo prestamo) {
        this.prestamo = prestamo;
    }
    public void generar(String tipo) {
        if (tipo.equals("texto")) {
            System.out.println("REPORTE TEXTO: " + prestamo.getLibro().getNombre()
                    + " - " + prestamo.getUsuario().getNombre());
        } else if (tipo.equals("PDF")) {
            System.out.println("REPORTE PDF: generando archivo .pdf...");
        } else if (tipo.equals("HTML")) {
            System.out.println("REPORTE HTML: <p>" + prestamo.getLibro().getNombre() + "</p>");
        }
    }
}
