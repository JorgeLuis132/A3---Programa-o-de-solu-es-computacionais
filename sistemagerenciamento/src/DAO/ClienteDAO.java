
package DAO;

import DTO.ClienteDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {
     ArrayList<ClienteDTO> lista = new ArrayList<>();
     private ConexaoDAO conexao = new ConexaoDAO();
     
     public void cadastrarCliente (ClienteDTO OBJClienteDTO) {
          String sql = "INSERT INTO cliente (nome, email, endereco, telefone) values (?, ?, ?, ?)";
          try {
             PreparedStatement pstm = conexao.getConnection().prepareStatement(sql);
             pstm.setString(1, OBJClienteDTO.getNome());
             pstm.setString(2, OBJClienteDTO.getEmail());
             pstm.setString(3, OBJClienteDTO.getEndereco());
             pstm.setString(4, OBJClienteDTO.getTelefone());
            pstm.execute();
            pstm.close();
            
        } catch(SQLException erro) {
           System.out.println("Erro ClienteDAO");
           
        }

}
     public ArrayList<ClienteDTO> pesquisarCliente() {
          String sql = "SELECT * FROM cliente";
         try {
             PreparedStatement pstm = conexao.getConnection().prepareStatement(sql);
              ResultSet rs = pstm.executeQuery();
              while(rs.next()) {
               ClienteDTO objClienteDTO = new ClienteDTO();
               objClienteDTO.setNome(rs.getString("nome"));
               objClienteDTO.setEmail(rs.getString("email"));
               objClienteDTO.setEndereco(rs.getString("endereco"));
               objClienteDTO.setTelefone(rs.getString("telefone"));
               lista.add(objClienteDTO);
              }
         } catch (Exception e) {
             System.out.println("Erro ClienteDAO pesquisar");
         }
         return lista;
     }
}