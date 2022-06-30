package Java.ejercicios;

public class ejerciciotema8 {
    
    public static void main(String[] args) {

        Persona persona1 = new Persona();

        persona1.setNombre("Jonathan");
        persona1.setEdad(30);
        persona1.setTelefono(54123);

        System.out.println(persona1.getNombre);
        System.out.println(persona1.getEdad);
        System.out.println(persona1.getTelefono);

    }

}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return this.nombre;
    }
    public int getEdad() {
        return this.edad;
    }
    public int getTelefono() {
        return this.telefono;
    }
}
