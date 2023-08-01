package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count=0;
        while(count < 10){
            System.out.println(++count);
            //count++;
        }
        //count = 0; (se inicializar em 0, entra no while, no demais é só do
        do{
            System.out.println("Dentro do do-while");
            count++;
        }while (count < 10);

        for (count = 0 ; count < 10 ; count++){
            System.out.println("For "+count);
        }

    }
}
