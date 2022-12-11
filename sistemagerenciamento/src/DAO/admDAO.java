
package DAO;

import DTO.AdmDTO;

import java.sql.PreparedStatement;

import java.sql.SQLException;
import com.sun.jdi.connect.spi.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class admDAO {
    private ConexaoDAO conexao = new ConexaoDAO();
    
   public ResultSet autenticacaoadm(AdmDTO objAdmDTO) {
       try {
           String sql = "select * from tbadm where email_adm = ? and senha_adm = ? ";
           PreparedStatement pstm = conexao.getConnection().prepareStatement(sql);
           pstm.setString(1, objAdmDTO.getEmail_adm());
           pstm.setString(2, objAdmDTO.getSenha_adm());
           ResultSet rs = pstm.executeQuery();
           return rs;
       } catch (SQLException erro) {
           System.out.println("Erro admDAO");
           return null;
       }
   }
}