
package cuentas;

/**
 *  Clase donde se almacenan todos los valores referentes a CCuenta
 * @author Jano
 * @see Main
 */
public class CCuenta {

    /**
     * getter de nombre
     * @return el valor de nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setter de nombre
     * @param nombre asigna un valor a nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getter de cuenta
     * @return el valor de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * setter de cuenta
     * @param cuenta asigna a cuenta un valor
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * getter de saldo
     * @return el valor de saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * setter de saldo
     * @param saldo asigna a saldo un valor
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * getter de tipoInteres
     * @return el valor de tipoInterés 
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * setter de tipoInteres
     * @param tipoInterés asigna a tipoInterés un valor
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     *
     */
    public CCuenta()
    {
    }

    /**
     *Constructor de CCuenta
     * @param nom el nombre
     * @param cue el IBAN de la cuenta
     * @param sal el saldo
     * @param tipo el tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * método para consultar el saldo
     * @return
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método para ingresar en la cuenta
     * @param cantidad
     * @throws Exception cuando la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retira de la cuenta
     * @param cantidad
     * @throws Exception cuando la cantidad es negativa o cuando la cantidad es mayor que el saldo restante
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
