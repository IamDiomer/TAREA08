package herencia.ejercicio01;

public class LuchadorAntiHeroe extends Luchador {
    private String personalidad;

    public LuchadorAntiHeroe(String nombre, int edad, String finisher_remate, String personalidad, String marca) {
        super(nombre, edad, finisher_remate, marca);
        this.personalidad = personalidad;
    }

    public void realizarActoHeroico() {
        System.out.println(nombre + " está realizando un acto heroico.");
    }

    @Override
    public void luchar() {
        System.out.println(nombre + " está luchando como Anti-Héroe en la WWE.");
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }

    @Override
    public String toString() {
        return "LuchadorAntiHeroe{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", finisher_remate='" + finisher_remate + '\'' +
                ", personalidad='" + personalidad + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
