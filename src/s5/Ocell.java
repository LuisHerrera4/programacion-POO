package s5;

public class Ocell extends Animal implements Volador{
    public Ocell(String nom, int edat) {
        super(nom, edat);
    }

    @Override
    public void mostrarInformacio() {
        System.out.println("Se llama: " + getNom()+ " tiene: "+ getEdat()+ " años");
    }

    @Override
    void ferSoroll() {
        System.out.println("Pio, pio");
    }


    @Override
    public void volar() {
        System.out.println("El ocell esta volant");

    }
}
