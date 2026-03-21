package uqvirtual.edu.co.app;


import uqvirtual.edu.co.model.*;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        RegistroAlimento rA = new RegistroAlimento();

        Alimento a1 = new Alimento(100, 4000, "Mani", TipoAlimento.BASICO);
        Alimento a2 = new Alimento(200, 2500, "chocolatina", TipoAlimento.AZUCARADO);

        rA.agregarAlimento(a1);
        rA.agregarAlimento(a2);

        Menu m = new Menu();

        rA.sincronizarMenu(m);

        RegistroCliente rC = new RegistroCliente();

        Cliente c1 = new Cliente("Daniel", TipoCliente.ESTUDIANTE);
        Cliente c2 = new Cliente("Robinson", TipoCliente.PROFESOR);

        rC.registrarCliente(c1);
        rC.registrarCliente(c2);

        Pedido p1 = new Pedido(1, c1, LocalDate.now());
        p1.agregarAlimento(a1);

        IEstrategiaDescuento eD = new DescuentoEstudiante();

        CalcularPedido cP = new CalcularPedido(p1, eD);

        double total = cP.calcular();

        System.out.println("El total del pedido es:" + total);
    }
}
