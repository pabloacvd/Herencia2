package ar.com.xeven;

public class Cuenta {
    private String moneda;
    private Double saldo;

    public Cuenta(){
        saldo = 0.0;
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