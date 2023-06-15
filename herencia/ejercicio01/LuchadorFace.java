package herencia.ejercicio01;

public class LuchadorFace extends Luchador {
    private int fans;
    private String fraseIconica;

    public LuchadorFace(String nombre, int edad, String finisher_remate, int fans, String fraseIconica, String marca) {
        super(nombre, edad, finisher_remate, marca);
        this.fans = fans;
        this.fraseIconica = fraseIconica;
    }

    public void saludarFans() {
        System.out.println(nombre + " está saludando a sus " + fans + " fans.");
    }

    @Override
    public void luchar() {
        System.out.println(nombre + " está luchando como Face en la WWE.");
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
        return "LuchadorFace{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", finisher_remate='" + finisher_remate + '\'' +
                ", fans=" + fans +
                ", fraseIconica='" + fraseIconica + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
