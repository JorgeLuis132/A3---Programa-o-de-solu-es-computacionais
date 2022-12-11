
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ConexaoDAO {
    
    private static Connection conexao = null;
    private Statement stm;
    
    public ConexaoDAO(){
        
    }

    public java.sql.Connection getConnection(){
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/funcionario?useTimezone=true&serverTimezone=America/Sao_Paulo", "root", "Joaoibi.123");
            System.out.println("Conectado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Falha ao conectar!");
        }
        return conexao;
    }

}