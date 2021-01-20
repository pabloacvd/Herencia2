package ar.com.xeven;

public class Cuenta {
    private String moneda;
    protected Double saldo;

    public Cuenta(Double saldoInicial){
        saldo = saldoInicial;
        moneda = "ARS";
    }
    public Double getSaldo(){ return saldo; }

    public void depositar(Double monto){
        saldo += monto;
    }
    public void extraer(Double monto){
        saldo -= monto;
    }
}