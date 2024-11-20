package sistemainvest;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection  {
	public static void main (String[] args) {
		String url = "jdbc:mysql://localhost:3306/systemlp2";
		String user = "root";
		String password = "";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); //carregar o driver
			
			//conectar ao banco
			java.sql.Connection connection = DriverManager.getConnection(url ,user, password);
			System.out.println("Conexão estabelecida com sucesso!");
			
			connection.close(); //fechar a conexão
			
		}catch (ClassNotFoundException  e) { //se a classe não for encontrada
			System.out.println("Driver não encontrado " + e.getMessage());
			
		}catch (SQLException e ) {
			System.out.println("Erro na conexão " + e.getMessage());
		}

	}
}