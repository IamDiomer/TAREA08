package herencia.ejercicio03;

public class Main {
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion("Shape of You", "Ed Sheeran", 240);
        CancionPop cancion2 = new CancionPop("Dance Monkey", "Tones and I", 210, "The Kids Are Coming");
        CancionRock cancion3 = new CancionRock("Smells Like Teen Spirit", "Nirvana", 300, "Nevermind");

        System.out.println(cancion1.toString());
        cancion1.reproducir();

        System.out.println(cancion2.toString());
        cancion2.reproducir();
        cancion2.bailar();

        System.out.println(cancion3.toString());
        cancion3.reproducir();
        cancion3.headbang();
    }
}