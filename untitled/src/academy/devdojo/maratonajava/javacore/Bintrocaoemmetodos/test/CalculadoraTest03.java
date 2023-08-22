package academy.devdojo.maratonajava.javacore.Bintrocaoemmetodos.test;

import academy.devdojo.maratonajava.javacore.Bintrocaoemmetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        //result = double result = calculadora.divideDoisNumeros(20,2);
        //System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros(20,0));
        System.out.println(calculadora.divideDoisNumeros(20,2));
        System.out.println(calculadora.divideDoisNumeros02(20,2));

    }
}
