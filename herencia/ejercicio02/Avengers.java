package herencia.ejercicio02;

public class Avengers extends Comics {
    private String personajePrincipal;
    private String autor;
    private String editorial;

    public Avengers(String titulo, int numPaginas, int anioPublicacion, String personajePrincipal, String autor, String editorial) {
        super(titulo, numPaginas, anioPublicacion);
        this.personajePrincipal = personajePrincipal;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getPersonajePrincipal() {
        return personajePrincipal;
    }

    public void setPersonajePrincipal(String personajePrincipal) {
        this.personajePrincipal = personajePrincipal;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Avengers{" +
                "titulo='" + titulo + '\'' +
                ", numPaginas=" + numPaginas +
                ", anioPublicacion=" + anioPublicacion +
                ", personajePrincipal='" + personajePrincipal + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';
    }

    @Override
    public void leer() {
        System.out.println("Leyendo el cómic de Avengers");
    }
}
