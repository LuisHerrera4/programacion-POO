package Cotxes;

import java.util.Collections;

public class MainCotxes {
    public static void main(String[] args) {
        Collections.sort(cotxes);
        cotxes.forEach(System.out::println);
    }
}
