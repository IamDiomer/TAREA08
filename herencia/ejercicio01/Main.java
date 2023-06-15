package herencia.ejercicio01;

public class Main {
    public static void main(String[] args) {
        Luchador luchador1 = new Luchador("John Cena", 43, "Attitude Adjustment", "AGENTE LIBRE");
        LuchadorFace luchador2 = new LuchadorFace("Roman Reigns", 36, "Spear", 6000000, "Believe That", "SMACK DOWN");
        LuchadorHeel luchador3 = new LuchadorHeel("Seth Rollins", 35, "Curb Stomp", 800000, "Burn It Down", "RAW");
        LuchadorAntiHeroe luchador4 = new LuchadorAntiHeroe("Stone Cold", 60, "Stunner", "Implacable", "Agente Libre");

        System.out.println(luchador1.toString());
        luchador1.luchar();

        System.out.println(luchador2.toString());
        luchador2.luchar();
        luchador2.saludarFans();

        System.out.println(luchador3.toString());
        luchador3.luchar();
        luchador3.provocar();

        System.out.println(luchador4.toString());
        luchador4.luchar();
        luchador4.realizarActoHeroico();
        System.out.println("Personalidad: " + luchador4.getPersonalidad());
    }
}