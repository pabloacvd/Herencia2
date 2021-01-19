package ar.com.xeven;
/*
Modelar las cuentas que maneja un banco de la siguiente manera:
Un cliente puede tener una cuenta corriente o una caja de ahorro.
En ambos tipos de cuentas se pueden realizar depósitos y extracciones.
Las cuentas pueden ser en distintas monedas.
 */
public class Main {

    public static void main(String[] args) {

        Cliente pablo = new Cliente();
        CajaDeAhorro cdaPablo = pablo.getcDeAhorro();

        cdaPablo.depositar(100.00);
        cdaPablo.extraer(50.25);
        cdaPablo.depositar(300.50);
        System.out.println("El saldo de pablo es: $"+cdaPablo.getSaldo());

    }
}
