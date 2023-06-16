package herencia.ejercicio03;

public class CancionReggaeton extends Cancion {
    private String colaboracion;

    public CancionReggaeton(String titulo, String artista, int duracion, String colaboracion) {
        super(titulo, artista, duracion);
        this.colaboracion = colaboracion;
    }

    public String getColaboracion() {
        return colaboracion;
    }

    public void setColaboracion(String colaboracion) {
        this.colaboracion = colaboracion;
    }

    @Override
    public String toString() {
        return "CancionReggaeton{" +
                "titulo='" + getTitulo() + '\'' +
                ", artista='" + getArtista() + '\'' +
                ", duracion=" + getDuracion() +
                ", colaboracion='" + colaboracion + '\'' +
                '}';
    }

    public void bailar() {
        System.out.println("Bailando con: " + getTitulo() + " - " + getArtista());
    }
}
