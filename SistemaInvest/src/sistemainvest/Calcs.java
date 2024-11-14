package sistemainvest;
import java.util.Random;


class ResultadoSimulacao {
    public double investimentoFinal;
    public double variacao;
    public int months;
    

    public ResultadoSimulacao(double investimentoFinal, double variacao, int months) {
        this.investimentoFinal = investimentoFinal;
        this.variacao = variacao;
        this.months = months;
    }
}
public class Calcs {

    public static double variation;
    static Random generator = new Random();
    static double percentage[] = new double[10]; //ainda n tenho ideia em q classe esse atributo ficaria

    public static ResultadoSimulacao option1(int months, double monthlyIncrease, double investment) {
        variation = 4 + generator.nextDouble() * 6; // valor minimo: 4 (6*0=0+4=4) valor max: 10(6*1=6+4=10)
        variation = 1 + (variation / 1000);
        percentage[(int)months] = variation;
        investment = investment + monthlyIncrease;
        investment = investment * variation;
        months--;
        
        return new ResultadoSimulacao(investment, variation, months);
    }

    public static ResultadoSimulacao option2(int months, double monthlyIncrease, double investment) {
        variation = generator.nextDouble() * 20; //min: 0  max: 20
        variation = 1 + (variation / 1000);
        percentage[(int)months] = variation;
        investment = investment + monthlyIncrease;
        investment = investment + variation;

        months--;
        
        return new ResultadoSimulacao(investment, variation, months);

    }

    public static ResultadoSimulacao option3(int months, double monthlyIncrease, double investment) {
        variation = -90 + generator.nextDouble() * 200; // min -90  max: 110 
        variation = 1 + (variation / 1000);
        percentage[(int)months] = variation;
        investment = investment + monthlyIncrease;
        investment = investment + variation;
        
        months--;
        
        return new ResultadoSimulacao(investment, variation, months);
    }
}
