package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
//     1 - Alocado espaço em memória pro objeto
//     2- cada atriibuto de classe é criado na inicialização com valores default ou o que for passado
//     3- Bloco de inicializazção é executado
//     4- Construtor é executado
    {
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
        for(int episodio : this.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }
}
