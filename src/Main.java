public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(32);
        persona.setNombre("V");
        persona.setTelefono(04522532134);

        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTeléfono());
    }
}
class Persona {
    private int edad;
    private String nombre;
    private int teléfono;

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
    public void setTelefono(int teléfono) {
        this.teléfono = teléfono;
    }
    public int getTeléfono() {
        return this.teléfono;
    }

}