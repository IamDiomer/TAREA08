package herencia.ejercicio03;
public class CancionRock extends Cancion {
    private String banda;

    public CancionRock(String titulo, String artista, int duracion, String banda) {
        super(titulo, artista, duracion);
        this.banda = banda;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    @Override
    public String toString() {
        return "CancionRock{" +
                "titulo='" + getTitulo() + '\'' +
                ", artista='" + getArtista() + '\'' +
                ", duracion=" + getDuracion() +
                ", banda='" + banda + '\'' +
                '}';
    }

    public void headbang() {
        System.out.println("Realizando headbang con: " + getTitulo() + " - " + getArtista());
    }
}