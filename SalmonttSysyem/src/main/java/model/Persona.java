package model;

public class Persona {
    // Atributos privados (Encapsulamiento)
    private String rut;
    private String nombre;
    private String fechaNacimiento;

    // Relación de Composición: Una Persona TIENE UNA Direccion
    private Direccion direccion;

    // Constructor
    public Persona(String rut, String nombre, String fechaNacimiento, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    // Métodos Getters y Setters
    // (Se incluyen solo algunos para brevedad, pero deben ir todos)

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Devuelve una representación legible del objeto Persona.
     * @return String con la información de la persona.
     */
    @Override
    public String toString() {
        return "RUT: " + rut +
                "\nNombre: " + nombre +
                "\nFecha Nacimiento: " + fechaNacimiento +
                "\nDirección: " + direccion.toString(); // Usa el toString de Direccion
    }
}