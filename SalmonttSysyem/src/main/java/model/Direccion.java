package model;


public class Direccion {
    // Atributos privados (Encapsulamiento)
    private String calle;
    private int numero;
    private String comuna;

    // Constructor
    public Direccion(String calle, int numero, String comuna) {
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
    }

    // Métodos Getters y Setters públicos
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    /**
     * Devuelve una representación legible del objeto Direccion.
     * @return String con la información de la dirección.
     */
    @Override
    public String toString() {
        return calle + " #" + numero + ", " + comuna;
    }
}