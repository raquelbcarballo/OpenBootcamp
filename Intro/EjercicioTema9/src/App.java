public class App {


    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();

        cliente.setEdad(25);
        System.out.println("Edad: " + cliente.getEdad());
        cliente.setNombre("Raquel");
        System.out.println("Nombre: " + cliente.getNombre());
        cliente.setTelefono("608841234");
        System.out.println("Teléfono: " + cliente.getTelefono());
        cliente.setCredito(87654);
        System.out.println("Crédito: " + cliente.getCredito());

        Trabajador trabajador = new Trabajador();

        trabajador.setEdad(30);
        System.out.println("Edad: " + trabajador.getEdad());
        trabajador.setNombre("Pepe");
        System.out.println("Nombre: " + trabajador.getNombre());
        trabajador.setTelefono("678987543");
        System.out.println("Teléfono: " + trabajador.getTelefono());
        trabajador.setSalario(1500);
        System.out.println("Crédito: " + trabajador.getSalario());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return this.telefono;
    }
}

class Cliente extends Persona{
    private int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return this.credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return this.salario;
    }
}