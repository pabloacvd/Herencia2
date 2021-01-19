package ar.com.xeven;

public class Cliente {
    private CuentaCorriente cCorriente;
    private CajaDeAhorro cDeAhorro;

    public Cliente(){
        cCorriente = new CuentaCorriente();
        cDeAhorro = new CajaDeAhorro();
    }

    public CuentaCorriente getcCorriente() {
        return cCorriente;
    }
    public CajaDeAhorro getcDeAhorro() {
        return cDeAhorro;
    }

}
