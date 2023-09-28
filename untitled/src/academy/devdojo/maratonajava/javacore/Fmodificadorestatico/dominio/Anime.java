package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
//     0 - Bloco de inicialização é executado quando a JVM carregar a classe
//     1 - Alocado espaço em memória pro objeto
//     2- cada atriibuto de classe é criado na inicialização com valores default ou o que for passado
//     3- Bloco de inicializazção é executado
//     4- Construtor é executado
    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public Anime() {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
        for (int episodio : Anime.episodios) {
             System.out.print(episodio + " ");
        }
        System.out.println();
    }
}
