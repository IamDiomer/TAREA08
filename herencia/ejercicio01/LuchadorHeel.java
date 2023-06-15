package herencia.ejercicio01;

public class LuchadorHeel extends Luchador {
    private int fans;
    private String fraseIconica;

    public LuchadorHeel(String nombre, int edad, String finisher_remate, int fans, String fraseIconica, String marca) {
        super(nombre, edad, finisher_remate, marca);
        this.fans = fans;
        this.fraseIconica = fraseIconica;
    }

    public void provocar() {
        System.out.println(nombre + " está provocando al público.");
    }

    @Override
    public void luchar() {
        System.out.println(nombre + " está luchando como Heel en la WWE.");
    }

    public int getFans() {
        return fans;
    }

    public void setFans(int fans) {
        this.fans = fans;
    }

    public String getFraseIconica() {
        return fraseIconica;
    }

    public void setFraseIconica(String fraseIconica) {
        this.fraseIconica = fraseIconica;
    }

    @Override
    public String toString() {
        return "LuchadorHeel{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", finisher_remate='" + finisher_remate + '\'' +
                ", fans=" + fans +
                ", fraseIconica='" + fraseIconica + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}