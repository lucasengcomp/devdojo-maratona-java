package academy.devdojo.maratonajava.construtores.test;

import academy.devdojo.maratonajava.construtores.dominio.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {
        Anime anime = new Anime("Akudama drive", "TV", 190, "Ação");
        anime.imprime();
    }
}
