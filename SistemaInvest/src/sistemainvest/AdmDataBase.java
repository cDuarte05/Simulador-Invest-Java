package sistemainvest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;

public class AdmDataBase {
    static Connection connection;

    public static void insertUser(String name, int id) throws SQLException{
        try {
            connection = DatabaseConnection.getConnection();
            String SQL = "INSERT INTO usuario (id, nome) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(SQL);
   
            statement.setInt(1, id);
            statement.setString(2, name);

            
        int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Cliente inserido com sucesso!");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir cliente: " + e.getMessage());
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }
    
    public static int insertInves(int id_usuario, int month, double valorInicial, double incremento, double valorFinal) throws SQLException {
        int generatedId = -1; // Variável para armazenar o ID gerado
        try {
            connection = DatabaseConnection.getConnection();
            String SQL = "INSERT INTO investimentos (meses, valor_inicial, incremento, id_usuario, valor_final) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            
            statement.setInt(1, month);
            statement.setDouble(2, valorInicial);
            statement.setDouble(3, incremento);
            statement.setInt(4, id_usuario);
            statement.setDouble(5, valorFinal);
            
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        generatedId = generatedKeys.getInt(1); // Recupera o ID gerado
                        System.out.println("Investimentos inseridos com sucesso! ID: " + generatedId);
                    }
                }
            }   
        } catch (SQLException e) {
            System.out.println("Erro ao inserir investimento: " + e.getMessage());
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
        return generatedId;
    }

    public static void variacoes(int id_usuario, int id_investimento,double variacao[]) throws SQLException {
    	try {
            connection = DatabaseConnection.getConnection();
            DecimalFormat formatoDecimal = new DecimalFormat("#.##"); 
            String SQL = "INSERT INTO variacoes (id_usuario, id_investimento, meses, variacao) VALUES (?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(SQL);

            for (int i = 0; i < variacao.length; i++) {
                    statement.setInt(1, id_usuario);
                    statement.setInt(2, id_investimento);
                    statement.setInt(3, i + 1); //escrever os meses
                    statement.setDouble(4, ((variacao[i] - 1)*100));
                    statement.addBatch(); //coloca todos os em um lote para enviar de uma vez depois
            }

            statement.executeBatch(); //envia o lote
            System.out.println("Variações salvas!");
    	}catch(SQLException e) {
    		System.out.println("ERRO AO SALVAR" + e.getMessage());
    	} finally {
            if (connection != null) {
                connection.close();
            }
        }
    } 

    public AdmDataBase() throws SQLException {
        this.connection = DatabaseConnection.getConnection();
    }
}
