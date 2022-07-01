public class ejercicio9 {
    public static void main(String[] args) {
        Cliente jona = new Cliente();
        jona.edad = 30;
        jona.nombre = "Jonathan";
        jona.teleofno = 348722;
        jona.credito = 0;

        Trabajador juan = new Trabajador();
        juan.edad = 33;
        juan.nombre = "Juan";
        juan.teleofno = 348722;
        juan.salario = 230000;

        System.out.println(juan.nombre);
        System.out.println(juan.edad);
        System.out.println(juan.teleofno);
        System.out.println(juan.salario);

        System.out.println(jona.nombre);
        System.out.println(jona.edad);
        System.out.println(jona.teleofno);
        System.out.println(jona.credito);

    }
}

class Persona {
    int edad;
    String nombre;
    int teleofno;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}