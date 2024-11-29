package sistemainvest;
import java.util.Random;


class ResultadoSimulacao {
    public double investimentoFinal;
    public double porcentagens[] = new double[InterfaceEscolhas.meses];
    
    public ResultadoSimulacao(double investimentoFinal, double variacao[]) { 
        this.investimentoFinal = investimentoFinal;
        this.porcentagens = variacao;
    }
}
public class Calcs {
    public int months;
    public static double variation;
    static Random generator = new Random();
    static double percentage[] = new double[InterfaceEscolhas.meses];

    public static ResultadoSimulacao option1(int months, double monthlyIncrease, double investment) {
        while (months > 0) {
            variation = 4 + generator.nextDouble() * 6; // valor minimo: 4 (6*0=0+4=4) valor max: 10(6*1=6+4=10)
            variation = 1 + (variation / 1000);
            percentage[months-1] = variation;
            investment = investment + monthlyIncrease;
            investment = investment * variation;
            months--;
        }
        return new ResultadoSimulacao(investment, percentage);
    }

    public static ResultadoSimulacao option2(int months, double monthlyIncrease, double investment) {
        while (months > 0) {
            variation = generator.nextDouble() * 20; //min: 0  max: 20
            variation = 1 + (variation / 1000);
            percentage[months - 1] = variation;
            investment = investment + monthlyIncrease;
            investment = investment * variation;
            months--;
        }
        return new ResultadoSimulacao(investment, percentage);
    }

    public static ResultadoSimulacao option3(int months, double monthlyIncrease, double investment) {
        while (months > 0) {
            variation = -90 + generator.nextDouble() * 200; // min -90  max: 110 
            variation = 1 + (variation / 1000);
            percentage[months - 1] = variation;
            investment = investment + monthlyIncrease;
            investment = investment * variation;
            months--;
        }
        return new ResultadoSimulacao(investment, percentage);
    }
}
