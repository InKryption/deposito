package cuentas;
public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(cuenta1, Operación.RETIRAR, 2300);
        operativa_cuenta(cuenta1, Operación.INGRESAR, 695);
    }

    static enum Operación {
        RETIRAR,
        INGRESAR;
    }
    static void operativa_cuenta(CCuenta cuenta, Operación op, float cantidad) {
        switch (op) {
            case RETIRAR:
                try {
                    cuenta.retirar(cantidad);
                } catch (Exception e) {
                    System.out.print("Fallo al retirar");
                }
                break;
            case INGRESAR:
                try {
                    cuenta.ingresar(cantidad);
                } catch (Exception e) {
                    System.out.print("Fall al ingresar");
                }
                break;
        }
    }
}
