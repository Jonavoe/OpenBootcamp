package Java.Ejercicios;
public class QueEstacion {
    public static void main(String[] args) {
        var estacion = "verano";

        switch(estacion) {
            case "otoño":
                System.out.println("Es Otoño");
            break;
            case "invierno":
                System.out.println("Es invierno");
            break;
            case "primavera":
                System.out.println("Es promaver");
            break;
            case "verano":
                System.out.println("Es verano");
            break;
            default:
                System.out.println("No es niguna estacion");

        }
    }
}
