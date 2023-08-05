package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.nome = "Ford";
        c1.modelo = "Fiesta";
        c1.ano = 2007;


        c2.nome = "Volkswagem";
        c2.modelo = "S10 Colina";
        c2.ano = 2004;
        //c1 = c2;
        System.out.println("Carro 1.");
        System.out.println("Marca: "+c1.nome);
        System.out.println("Modelo: "+c1.modelo);
        System.out.println("Ano: "+c1.ano);

        System.out.println("Carro 2.");
        System.out.println("Marca: "+c2.nome);
        System.out.println("Modelo: "+c2.modelo);
        System.out.println("Ano: "+c2.ano);



    }
}
