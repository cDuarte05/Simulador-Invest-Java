package sistemainvest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // variaveis para URL, usuário e senha do banco
    private static final String URL = "jdbc:mysql://localhost:3306/systemlp2";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Método estático para obter uma conexão
    public static Connection getConnection() throws SQLException {
        try {
            // Carregar o driver (apenas necessário para versões antigas do Java)
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Retornar a conexão
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver JDBC não encontrado: " + e.getMessage());
        }  
    }
}
