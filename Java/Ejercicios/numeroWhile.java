package Java.ejercicios;
public class numeroWhile {
    public static void main(String[] args) {
        var numeroWhile = 0;

        while(numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
    }

    public static void dowhile(String[] args) {
        var contador = 2;

        do {
            System.out.println(contador);
            contador++;
        } while(contador > 3 );
    }
}
