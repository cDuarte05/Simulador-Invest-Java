package sistemainvest;
import java.util.Random;

public class Calcs {

    public static double variacao;
    static Random gerador = new Random();
    static double porcentagem[] = new double[objeto.meses]; //cria um vetor do tamanho de meses. Preciso saber onde vai estar a variavel meses para completar
    //TODO : Arrumar as gerações de número, tá estranho
    public static void option1(float meses, double acresmensal, double invest) {
        variacao = gerador.nextDouble() * 7 + 4; //gera um valor entre 0 e 1, mas nunca exibindo o 1
        variacao = 1 + (variacao / 1000);
        porcentagem[objeto.meses - 1] = variacao;
        invest = invest + acresmensal;
        invest = invest * variacao;
        objeto.meses--;
    }

    public static void option2(int meses, double acresmensal, double invest) {
        variacao = gerador.nextDouble() * 21;
        variacao = 1 + (variacao / 1000);
        porcentagem[objeto.meses - 1] = variacao;
        invest = invest + acresmensal;
        invest = invest + variacao;
        objeto.meses--;
    }

    public static void option3(int meses, double acresmensal, double invest) {
        variacao = gerador.nextDouble() * 201 - 90;
        variacao = 1 + (variacao / 1000);
        porcentagem[objeto.meses - 1] = variacao;
        invest = invest + acresmensal;
        invest = invest + variacao;
        objeto.meses--;
    }
}
