package cuentas;

/**
 * Clase que representa una cuenta bancaria
 */
public class CCuenta {
    /**
     * Nombre de esta cuenta
     */
    private String nombre;
    /**
     * El ID de la cuenta en formato String
     */
    private String cuenta;
    /**
     * El saldo contenido en esta cuenta
     */
    private double saldo;
    /**
     * El tipo de interés de esta cuenta
     */
    private double tipoInterés;

    /**
     * Construye una cuenta con todos los atributos con valor 'null'
     */
    public CCuenta() {
    }

    /**
     * @param nom Nombre informal para la cuenta
     * @param cue ID para la cuenta
     * @param sal Saldo disponible para la cuenta
     * @param tipo Tipo de interés para la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * @return El estado del saldo
     */
    public double estado() {
        return saldo;
    }

    /**
     * 
     * @param cantidad La cantidad de dinero a ingresar
     * @throws Exception indicando la invalideza de la cantidad
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * @param cantidad La cantidad de dinero a retirar
     * @throws Exception indicando la invalideza de la cantidad
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * @return El nombre informal
     */
    public String nombre() {
        return nombre;
    }

    /**
     * @return La ID de la cuenta en formato de String
     */
    public String cuenta() {
        return cuenta;
    }

    /**
     * @return El valor del tipo de interés
     */
    public double tipoInterés() {
        return tipoInterés;
    }
}
