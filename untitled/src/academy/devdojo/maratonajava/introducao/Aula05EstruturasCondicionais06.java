package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Dado os valores de 1 a 7, imprima se é dia útil ou final de semana.
        //Considerando 1 como domingo
        byte dia = 7;
        String diaUtil = "Dia Útil";
        String diaFds = "Fim de semana";
        switch (dia){
            case 1:
                System.out.println(diaFds);
                break;
            case 2:
                System.out.println(diaUtil);
                break;
            case 3:
                System.out.println(diaUtil);
                break;
            case 4:
                System.out.println(diaUtil);
                break;
            case 5:
                System.out.println(diaUtil);
                break;
            case 6:
                System.out.println(diaUtil);
                break;
            case 7:
                System.out.println(diaFds);
                break;
            default:
                System.out.println("O valor informado é inválido");
        }
    }
}
