package app;

import model.Direccion;
import model.Persona;
import model.Empleado;

/**
 * Clase principal para probar la creación e interacción con los objetos del sistema Salmontt.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Personas Salmontt");
        System.out.println("------------------------------------\n");

        // --- 1. Crear una Dirección (para composición) ---
        Direccion dirGerente = new Direccion("Angelmo", 55, "Puerto Montt");

        // --- 2. Crear una instancia de Empleado (Herencia) ---
        // La instancia de Empleado ya contiene una instancia de Direccion
        Empleado gerenteGeneral = new Empleado(
                "15.123.456-7",
                "Sofía Labbé",
                "05/03/1982",
                dirGerente, // Objeto Direccion por composición
                "Gerente Recursos Humanos y Finanzas",
                "01/03/2010",
                6500000.00
        );

        // --- 3. Crear otra Dirección y otra instancia de Persona (Composición) ---
        Direccion dirProveedor = new Direccion("Las Truchas", 1200, "Osorno");

        Persona proveedor = new Persona(
                "90.876.543-2",
                "Carlos Gonzalez (Proveedor)",
                "10/11/1975",
                dirProveedor
        );

        // --- 4. Crear una tercera instancia de Empleado ---
        Direccion dirOperario = new Direccion("Volcán Tupungatito", 305, "Puerto Varas");

        Empleado operarioPlanta = new Empleado(
                "18.000.111-2",
                "Javier Leiva",
                "20/07/1995",
                dirOperario,
                "Operario maquinaria grande de Planta",
                "15/05/2022",
                850000.00
        );

        // --- Mostrar los datos por consola usando toString() ---

        System.out.println("Instancia 1: Gerente Recursos Humanos y Finanzas");
        System.out.println(gerenteGeneral.toString());
        System.out.println("\n------------------------------------\n");

        System.out.println("Instancia 2: Persona (Proveedor)");
        System.out.println(proveedor.toString());
        System.out.println("\n------------------------------------\n");

        System.out.println("Instancia 3: Operario maquinaria grande de Planta");
        System.out.println(operarioPlanta.toString());
        System.out.println("\n====================================\n");

        // Ejemplo de uso de Getter y Setter para demostrar encapsulamiento
        System.out.println("Cambiando el salario de " + operarioPlanta.getNombre() + "...");
        operarioPlanta.setSalario(920000.00);
        System.out.println("Nuevo salario: $" + operarioPlanta.getSalario());
    }
}