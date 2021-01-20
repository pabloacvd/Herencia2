package ar.com.xeven;
/*
Modelar las cuentas que maneja un banco de la siguiente manera:
Un cliente puede tener una cuenta corriente o una caja de ahorro.
En ambos tipos de cuentas se pueden realizar depósitos y extracciones.
Las cuentas pueden ser en distintas monedas.
 */
public class Main {

    public static void main(String[] args) {

        // cuando se crea un cliente se debe especificar el saldo inicial
        // en su caja de ahorro.
        // en la CuentaCorriente tendrá saldo cero.

        Cliente pablo = new Cliente(50.00);
        CajaDeAhorro cdaPablo = pablo.getcDeAhorro();

        cdaPablo.depositar(100.00);
        cdaPablo.extraer(50.25);
        cdaPablo.depositar(300.50);
        System.out.println("El saldo de pablo es: $"+cdaPablo.getSaldo());

    }
}
