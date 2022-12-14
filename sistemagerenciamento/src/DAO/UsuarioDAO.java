package DAO;

import DTO.AdmDTO;
import DTO.UsuarioDTO;
import java.sql.SQLException;
import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    ArrayList<UsuarioDTO> lista = new ArrayList<>();
    private ConexaoDAO conexao = new ConexaoDAO();

    public ResultSet autenticacaousuario(UsuarioDTO objUsuarioDTO) {
        try {
            String sql = "select * from tbusuario where email_usuario = ? and senha_usuario = ? ";
            PreparedStatement pstm = conexao.getConnection().prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getEmail_usuario());
            pstm.setString(2, objUsuarioDTO.getSenha_usuario());
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro) {
            System.out.println("Erro UsuarioDAO");
            return null;
        }
    }

    public void cadastrarusuario(UsuarioDTO objUsuarioDTO) {
        String sql = "INSERT INTO tbusuario (nome_usuario, email_usuario, senha_usuario, telefone_usuario) values (?, ?, ?, ?)";
        try {
            PreparedStatement pstm = conexao.getConnection().prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getNome_usuario());
            pstm.setString(2, objUsuarioDTO.getEmail_usuario());
            pstm.setString(3, objUsuarioDTO.getSenha_usuario());
            pstm.setString(4, objUsuarioDTO.getTelefone_usuario());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            System.out.println("Erro UsuarioDAO");

        }

    }

    public ArrayList<UsuarioDTO> PesquisarUsuario() {
        String sql = "SELECT * FROM tbusuario";

        try {
            PreparedStatement pstm = conexao.getConnection().prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                UsuarioDTO objUsuarioDTO = new UsuarioDTO();
                objUsuarioDTO.setId_usuario(rs.getInt("id_usuario"));
                objUsuarioDTO.setNome_usuario(rs.getString("nome_usuario"));
                objUsuarioDTO.setEmail_usuario(rs.getString("email_usuario"));
                objUsuarioDTO.setSenha_usuario(rs.getString("senha_usuario"));
                objUsuarioDTO.setTelefone_usuario(rs.getString("telefone_usuario"));
                lista.add(objUsuarioDTO);

            }
        } catch (SQLException erro) {
            System.out.println("Erro UsuarioDAO pesquisar");
        }
        return lista;
    }

    public void ExcluirUsuario(UsuarioDTO objUsuarioDTO) {
        String sql = "delete from tbusuario where id_usuario = ?";
          try {
             PreparedStatement pstm = conexao.getConnection().prepareStatement(sql);
             pstm.setInt(1, objUsuarioDTO.getId_usuario());
             pstm.execute();
             pstm.close();
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Usuário não encontrado");
         }
    }
}