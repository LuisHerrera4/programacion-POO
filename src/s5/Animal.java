package s5;

public abstract class Animal {
    private String nom;
    private int edat;

    public Animal(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void mostrarInformacio(){
        System.out.println("Nom: "+ nom+ ", Edat: "+ edat);
    }

    abstract void ferSoroll();

}
