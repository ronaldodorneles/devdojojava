package academy.devdojo.maratonajava.javacore.Bintrocaoemmetodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println("---------------------------------------");
        estudante.nome = "Gohan";
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
