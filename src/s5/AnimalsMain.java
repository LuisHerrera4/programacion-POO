package s5;

public class AnimalsMain {
    public static void main(String[] args) {
        Gos g = new Gos("Toby", 3);
        Ocell oc = new Ocell("Callou", 1);

        g.ferSoroll();
        g.mostrarInformacio();
        oc.ferSoroll();
        oc.volar();
        oc.mostrarInformacio();
    }
}
