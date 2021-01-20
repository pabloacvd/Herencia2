package ar.com.xeven;

public class CuentaCorriente extends Cuenta{
    // tiene un descubierto que es igual para todos los clientes
    // y HOY vale $5000.00
    private static final Double descubierto = 5000.0;

    public CuentaCorriente(Double saldoInicial) {
        super(saldoInicial);
    }

    public static Double getDescubierto() {
        return descubierto;
    }

    // SOBREESCRIBIR el método extraer()
    @Override
    public void extraer(Double monto) {
        if(monto >= (saldo+descubierto))
            return;
        super.extraer(monto);
    }
}
