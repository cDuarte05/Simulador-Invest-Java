package sistemainvest;

import java.sql.SQLException;

public class Teste {
	public static void main(String[] args) throws SQLException {
	    AdmDataBase admDataBase = new AdmDataBase();

	    double porcentagens[] = {5,2,4,5};
	    // Insere um usuário para teste
	    admDataBase.insertUser("test", 2);

	    // Testa inserção de investimento
	    admDataBase.insertInves(1, 24, 5000.00, 200.00); // ID do usuário = 1
	    admDataBase.variacoes(1, 3, porcentagens);
	}

}
