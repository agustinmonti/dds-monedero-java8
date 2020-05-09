package dds.monedero.model;

import java.time.LocalDate;

public class Extraccion extends Movimiento {
    public Extraccion(LocalDate fecha, double monto) {
        super(fecha, monto, false);
    }

    @Override
    public double calcularValor(Cuenta cuenta) {
        return cuenta.getSaldo() - getMonto();
    }
}
