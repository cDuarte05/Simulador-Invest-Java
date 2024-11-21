package sistemainvest;
import java.util.Random;


class ResultadoSimulacao {
    public double investimentoFinal;
    public double porcentagens[] = new double[InterfaceEscolhas.meses];

// Acredito que esse trecho de código não seja necessário, talvez eu tenha entendido errado oq ele faz, mas parece não fazer nada
//    public ResultadoSimulacao(double investimentoFinal, double variacao, int months) { 
//        this.investimentoFinal = investimentoFinal;
//        this.variacao = variacao;
//        this.months = months;
//    }
}
public class Calcs {
    public int months;
    public static double variation;
    static Random generator = new Random();
    static double percentage[] = new double[InterfaceEscolhas.meses]; //ainda n tenho ideia em q classe esse atributo ficaria --> !! Aqui msm, é parte do cálculo !!

    public static ResultadoSimulacao option1(int months, double monthlyIncrease, double investment) {
        while (months > 0) {
            variation = 4 + generator.nextDouble() * 6; // valor minimo: 4 (6*0=0+4=4) valor max: 10(6*1=6+4=10)
            variation = 1 + (variation / 1000);
            percentage[months-1] = variation;
            investment = investment + monthlyIncrease;
            investment = investment * variation;
            months--;
        }
        ResultadoSimulacao result = new ResultadoSimulacao();
        result.investimentoFinal = investment;
        result.porcentagens = percentage;
        return result;
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
        ResultadoSimulacao result = new ResultadoSimulacao();
        result.investimentoFinal = investment;
        result.porcentagens = percentage;
        return result;
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
        ResultadoSimulacao result = new ResultadoSimulacao();
        result.investimentoFinal = investment;
        result.porcentagens = percentage;
        return result;
    }
}
