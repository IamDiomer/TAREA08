package herencia.ejercicio03;

public class CancionPop extends Cancion {
    private String album;

    public CancionPop(String titulo, String artista, int duracion, String album) {
        super(titulo, artista, duracion);
        this.album = album;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "CancionPop{" +
                "titulo='" + getTitulo() + '\'' +
                ", artista='" + getArtista() + '\'' +
                ", duracion=" + getDuracion() +
                ", album='" + album + '\'' +
                '}';
    }

    public void bailar() {
        System.out.println("Bailando al ritmo de: " + getTitulo() + " - " + getArtista());
    }
}