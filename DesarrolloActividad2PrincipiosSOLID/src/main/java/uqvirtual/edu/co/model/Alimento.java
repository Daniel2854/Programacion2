package uqvirtual.edu.co.model;

public class Alimento {
    private int codigo;
    private double valor;
    private String nombre;
    private TipoAlimento tipo;

    public Alimento (int codigo, double valor, String nombre, TipoAlimento tipo) {
        this.codigo = codigo;
        this.valor = valor;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public TipoAlimento getTipo() {
        return tipo;
    }
}
