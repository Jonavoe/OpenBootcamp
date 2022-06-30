package Java.Ejercicios;
public class CochePuertas {
    public static void main(String[] argss) {
    Coche miCoche = new Coche();
    miCoche.AñadirPuerta();
    miCoche.AñadirPuerta();
    miCoche.AñadirPuerta();
    miCoche.AñadirPuerta();
    System.out.println(miCoche.puertas);
    }
        
    public static int suma(int a, int b) {
        return a + b;
    }
    
}

class Coche {
    public int puertas = 0;

    public void AñadirPuerta() {
        this.puertas++;
    }
}
