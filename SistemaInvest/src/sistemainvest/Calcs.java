package sistemainvest;
import java.util.Random;


class ResultadoSimulacao {
    public double investimentoFinal;
    public double porcentagens[] = new double[InterfaceEscolhas.meses];
    
    public ResultadoSimulacao() {}
    
    public ResultadoSimulacao(double investimentoFinal) { 
        this.investimentoFinal = investimentoFinal;
    }
    
    public ResultadoSimulacao(double investimentoFinal, double variacao[]) { 
        this.investimentoFinal = investimentoFinal;
        this.porcentagens = variacao;
    }
}

public class Calcs {
    public static int months;
    public static double variation;
    static Random generator = new Random();
    static double percentage[]; //new double[InterfaceEscolhas.meses];
    static double valorMesInicial[];
    static double valorMesFinal[];

    public static ResultadoSimulacao runCalcs (int opt, int months, double monthlyIncrease, double investment) {
        percentage = new double [months];
        valorMesInicial = new double [months];
        valorMesFinal = new double [months];
        switch (opt) {
            case 1: System.out.println("Opcao segura"); break;
            case 2: System.out.println("Opcao intermediária"); break;
            case 3: System.out.println("Opcao arriscada"); break;
        }
        while (months > 0) {
            valorMesInicial[months-1] = investment;
            switch (opt) {
                case 1: variation = -20 + generator.nextDouble() * 100; // min -2% max 8%
                    break;
                case 2: variation = -60 + generator.nextDouble() * 180; //min -6% max 12%
                    break;
                case 3: variation = -150 + generator.nextDouble() * 350; // min -15% max 25%
                    break;
            } 
            variation = 1 + (variation / 1000);
            percentage[months-1] = variation;
            investment = investment + monthlyIncrease;
            investment = investment * variation;
            valorMesFinal[months-1] = investment;
            months--;
            }
            return new ResultadoSimulacao(investment, percentage);
    }
    
    public static ResultadoSimulacao acessandoTabela (int months,double porcentagens[], double monthlyIncrease, double investment) {
        InterfaceEscolhas.meses = months;
        percentage = new double [months];
        percentage = porcentagens;
        valorMesInicial = new double [months];
        valorMesFinal = new double [months];
        int i = 0;
        while (months > 0) {
            variation = percentage[i];
            valorMesInicial[months-1] = investment;
            variation = 1 + (variation / 100);
            investment = investment + monthlyIncrease;
            investment = investment * variation;
            valorMesFinal[months-1] = investment;
            months--;
            i++;
            }
        return new ResultadoSimulacao (investment);
    }
}
