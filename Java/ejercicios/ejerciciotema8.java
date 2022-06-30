package Java.ejercicios;

public class ejerciciotema8 {
    
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setNombre("Jonathan");
        persona.setEdad(30);
        persona.setTelefono(54123);

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());

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
