package ar.com.xeven;

public class Cliente {
    private CuentaCorriente cCorriente;
    private CajaDeAhorro cDeAhorro;

    public Cliente(Double saldoInicial){
        cCorriente = new CuentaCorriente(0.00);
        cDeAhorro = new CajaDeAhorro(saldoInicial);
    }

    public CuentaCorriente getcCorriente() {
        return cCorriente;
    }
    public CajaDeAhorro getcDeAhorro() {
        return cDeAhorro;
    }

}
