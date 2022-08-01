package academy.devdojo.maratonajava.modificadoresestaticos.dominio;

public class Anime {

    private String nome;
    private static int[] episodios = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    /**
     * 0 - Bloco de inicialização é executado quando a JVM carregar a classe (carregados na ordem que aparecem)
     * 1 - Alocado espaço em memória para o projeto
     * 2 - Cada atributo de classe é criado e inicializado com valores default
     * 3 - Bloco de inicialização é executado
     * 4 - Construtor é executado
     *
     * */


    static {
        System.out.println("Dentro do bloco de inicialização estático 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 3");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 4");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }

    public Anime() {

        for (int episodio : episodios) {
            System.out.print(episodio + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
