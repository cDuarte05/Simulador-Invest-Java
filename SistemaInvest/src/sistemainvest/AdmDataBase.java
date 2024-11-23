/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemainvest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdmDataBase {
    
    public void insertUser(String name, int id) throws SQLException{
        try(Connection connection = DatabaseConnection.getConnection()){    
            String SQL = "INTERT INTO cliente (id, nome) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(SQL);
            
            statement.setString(1, name);
            statement.setInt(2, id);

            
        int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Cliente inserido com sucesso!");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir clliente: " + e.getMessage());
          }
    }
    
    public void insertInves(int month, double valorIncial, double increment){
        try(Connection connection = DatabaseConnection.getConnection()){    
            String SQL = "INSERT INTO cliente (meses, valorInicial, increment) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(SQL);
            
            statement.setInt(1, month);
            statement.setDouble(2, valorIncial);
            statement.setDouble(3, increment);

        int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Cliente inserido com sucesso!");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir cliente: " + e.getMessage());
          }
    }

    void insertUser(int meses, double inicial, double incremento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 }

