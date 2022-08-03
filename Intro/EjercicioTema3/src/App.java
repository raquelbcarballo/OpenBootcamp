public class App {
    public static void main(String[] args) throws Exception {

        //primera parte
        int resultado=0;
        resultado = suma (1,2,3);
        System.out.println(resultado);

        //segunda parte
        Coche miCoche = new Coche(0);
        miCoche.sumaPuertas(5);
        miCoche.imprimirInformacion();
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }

}

class Coche{
    private int nPuertas=0;
    public Coche(int nPuertas){
        this.nPuertas=nPuertas;
    }
    public void sumaPuertas(int nPuertas){
        this.nPuertas+=nPuertas;
    }
    public void imprimirInformacion(){
        System.out.println("Número de puertas: " + nPuertas);
    }
}