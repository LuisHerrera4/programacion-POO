package s5;

public class Gos extends Animal {

    public Gos(String nom, int edat) {
        super(nom, edat);

    }

    @Override
    public void mostrarInformacio() {
        System.out.println("Se llama: " + getNom()+ " tiene: "+ getEdat() + " años y hace este sonido: ");
    }

    @Override
    void ferSoroll() {
        System.out.println("Gua, gua");
    }

}
