public class App {

    public static void main(String[] args) throws Exception {
        Persona persona = new Persona();

        persona.setEdad(25);
        System.out.println("Edad: " + persona.getEdad());
        persona.setNombre("Raquel");
        System.out.println("Nombre: " + persona.getNombre());
        persona.setTelefono("608841234");
        System.out.println("Teléfono: " + persona.getTelefono());
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