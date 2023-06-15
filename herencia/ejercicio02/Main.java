package herencia.ejercicio02;

public class Main {
    public static void main(String[] args) {
        Halo comic1 = new Halo("Halo: Escalation", 144, 2013, "John-117 (Master Chief)", "Brian Reed", "Dark Horse Comics");
        Transformers comic2 = new Transformers("Transformers: More Than Meets the Eye", 120, 2012, "Optimus Prime", "James Roberts", "IDW Publishing");
        JusticeLeague comic3 = new JusticeLeague("Justice League: Origin", 192, 2011, "Superman, Batman, Wonder Woman", "Geoff Johns", "DC Comics");
        Avengers comic4 = new Avengers("Avengers: Disassembled", 208, 2004, "Iron Man, Captain America, Thor", "Brian Michael Bendis", "Marvel Comics");

        System.out.println(comic1.toString());
        comic1.leer();

        System.out.println(comic2.toString());
        comic2.leer();

        System.out.println(comic3.toString());
        comic3.leer();

        System.out.println(comic4.toString());
        comic4.leer();
    }
}