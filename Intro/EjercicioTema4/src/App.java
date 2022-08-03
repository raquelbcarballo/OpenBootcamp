public class App {
    public static void main(String[] args) throws Exception {

        int numeroIf = -5;
        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println("El número del while ahora es: " + numeroWhile);
            numeroWhile += 1;
        }

        int numeroDoWhile = 1;
        do {
            System.out.println("El número del do while ahora es: " + numeroDoWhile);
            numeroDoWhile += 1;
        } while (numeroDoWhile < 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El número del for ahora es: " + numeroFor);
        }

        String estacion = "verano";
        switch (estacion) {
            case "invierno":
                System.out.println("La estación es: " + estacion);
                break;
            case "primavera":
                System.out.println("La estación es: " + estacion);
                break;
            case "verano":
                System.out.println("La estación es: " + estacion);
                break;
            case "otoño":
                System.out.println("La estación es: " + estacion);
                break;
            default:
                break;
        }

    }
}