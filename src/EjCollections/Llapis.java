package EjCollections;

import java.util.Objects;

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

    /*
    Esto es necesario (equals, hasCode) para que el set detecte lso ducplicados que en mi caso he elegido que
    detecte los duplicados por color y grosor
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Llapis llapis = (Llapis) o;
        return color == llapis.color && Float.compare(gruix, llapis.gruix) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, gruix);
    }
}
