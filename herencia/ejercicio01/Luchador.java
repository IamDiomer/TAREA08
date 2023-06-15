package herencia.ejercicio01;

public class Luchador {
    protected String nombre;
    protected int edad;
    protected String finisher_remate;
    protected String marca;

    public Luchador(String nombre, int edad, String finisher_remate, String marca) {
        this.nombre = nombre;
        this.edad = edad;
        this.finisher_remate = finisher_remate;
        this.marca = marca;
    }

    public void luchar() {
        System.out.println(nombre + " está luchando en la WWE.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFinisher_remate() {
        return finisher_remate;
    }

    public void setFinisher_remate(String finisher_remate) {
        this.finisher_remate = finisher_remate;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Luchador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", finisher_remate='" + finisher_remate + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}