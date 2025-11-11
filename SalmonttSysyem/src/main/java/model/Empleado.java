package model;

//Heredado de la clase persona

public class Empleado extends Persona {
    // Atributos
    private String cargo;
    private String fechaContratacion;
    private double salario;

    // Constructor: Debe llamar al constructor de la clase base (super)
    public Empleado(String rut, String nombre, String fechaNacimiento, Direccion direccion,
                    String cargo, String fechaContratacion, double salario) {
        super(rut, nombre, fechaNacimiento, direccion); // Llama al constructor de Persona
        this.cargo = cargo;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
    }

    // Métodos Getters y Setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

  // Retorna toda la información del empleado

    @Override
    public String toString() {
        // Llama al toString de la clase base (Persona) y añade los datos de Empleado
        return "--- Detalle Empleado ---\n" +
                super.toString() +
                "\nCargo: " + cargo +
                "\nFecha Contratación: " + fechaContratacion +
                String.format("\nSalario: $%,.0f", salario);
    }
}