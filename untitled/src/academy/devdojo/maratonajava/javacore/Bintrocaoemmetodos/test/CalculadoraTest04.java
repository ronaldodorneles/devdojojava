package academy.devdojo.maratonajava.javacore.Bintrocaoemmetodos.test;

import academy.devdojo.maratonajava.javacore.Bintrocaoemmetodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
    int a = 1;
    int b = 2;
    Calculadora calculadora = new Calculadora();
    calculadora.alteraDoisNumeros(a,b);
        System.out.println("");
        System.out.println("Dentro do CalculadoraTest04");
        System.out.println(a);
        System.out.println(b);
    }
}
