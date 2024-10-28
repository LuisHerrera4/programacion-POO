package EjCollections;

import java.util.*;

public class MainLlapis {
    public static void main(String[] args) {
        List<Llapis> caixa1 = new ArrayList<>();
        List<Llapis> caixa2 = new ArrayList<>();

        for (int i=0; i< 10; i++){
            int colorRandom= (int)(Math.random()*8);
            caixa1.add(new Llapis(colorRandom));
        }

        for (int i=0; i< 10; i++){
            int colorRandom= (int)(Math.random()*8);
            float gruixLlapis= (float)(Math.random()*2.9+0.1);
            caixa2.add(new Llapis(colorRandom,gruixLlapis));
        }

        //Este fragmento para ordenar caja1 con el override en la clase lapiz

        System.out.println("Ordenado por color");
        Collections.sort(caixa1);
        //for normal
        for (int i = 0; i < caixa1.size(); i++) {
            Llapis l = caixa1.get(i);
            System.out.println(l);
        }

        //Este fragmento es para ordenar caja2 con la clase anonima y el Comparator
        System.out.println("Ordenado por gruix");
        Collections.sort(caixa2, new Comparator<Llapis>() {
            @Override
            public int compare(Llapis l, Llapis t1) {

                if(l.getGruix()> t1.getGruix())return -1;
                else if (l.getGruix()< t1.getGruix())return 1;
                else return 0;
            }
        });

        //for each
        for(Llapis l:caixa2){
            System.out.println(l);
        }

        LinkedList<Llapis> caixa2Link = new LinkedList<>(caixa2);

        for(Llapis l: caixa2Link){
            System.out.println(l);
        }
    }
}
