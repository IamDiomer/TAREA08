package herencia.ejercicio02;

public class Comics {
    protected String titulo;
    protected int numPaginas;
    protected int anioPublicacion;

    public Comics(String titulo, int numPaginas, int anioPublicacion) {
        this.titulo = titulo;
        this.numPaginas = numPaginas;
        this.anioPublicacion = anioPublicacion;
    }

    public void leer() {
        System.out.println("Leyendo el cómic: " + titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "titulo='" + titulo + '\'' +
                ", numPaginas=" + numPaginas +
                ", anioPublicacion=" + anioPublicacion +
                '}';
    }
}