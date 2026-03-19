import java.sql.SQLOutput;
import java.util.Scanner;

public class ExemplosEntradaDados {

    //Criar um programa para ler e calcular a media da Fiap
    public static void main(String[] args) {
        //Criar o objeto para ler o teclado
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a nota da cp 1");
        double cp1 = leitor.nextDouble();

        System.out.println("Digite a nota da cp 2");
        double cp2 = leitor.nextDouble();

        System.out.println("Digite a nota dos Challenge 1");
        double cl1 = leitor.nextDouble();

        System.out.println("Digite a nota dos Challenge 2");
        double cl2 = leitor.nextDouble();

        System.out.println("Digite a nota do Global");
        double gs = leitor.nextDouble();

        //Calcular a média

        double medcp = (cp1 + cp2)/2; //Média das cps
        double medcl = (cp1 + cp2)/2; //Média das cl

        double medfin = ((medcp * 20) + (medcl * 20) + (gs*60))/100; //Média final

        System.out.println ("Média final é : "+medfin);




    }


}

