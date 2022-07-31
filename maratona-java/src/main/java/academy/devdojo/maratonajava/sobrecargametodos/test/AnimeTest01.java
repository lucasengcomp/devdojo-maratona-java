package academy.devdojo.maratonajava.sobrecargametodos.test;

import academy.devdojo.maratonajava.sobrecargametodos.dominio.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {
        Anime anime = new Anime();
//        anime.setNome("Akudama drive");
//        anime.setTipo("TV");
//        anime.setEpisodios(12);

        anime.init("Akudama drive", "TV", 190);
        anime.init("Akudama drive", "TV", 190, "Ação");
        anime.imprime();
    }
}
