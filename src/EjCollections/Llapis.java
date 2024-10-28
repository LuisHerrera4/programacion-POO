package EjCollections;

public class Llapis implements Comparable<Llapis>{

    private int color;
    private float gruix;

    public Llapis(int color, float gruix) {
        this.color = color;
        this.gruix = gruix;
    }

    //Creamos este constructor para que no nos obligue a poner el gruix.
    public Llapis(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public float getGruix() {
        return gruix;
    }

    public void setGruix(float gruix) {
        this.gruix = gruix;
    }

    @Override
    public String toString(){
        return "LLapis de color: "+ color+ ", gruix del llapis: "+ gruix;
    }

    @Override
    public int compareTo(Llapis l) {
        if(this.color > l.getColor()) return -1;
        else if (this.color< l.getColor()) return 1;
        else return 0;
    }
}
