
package DAO;

import DTO.EquipamentosDTO;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EquipamentosDAO {
    ArrayList<EquipamentosDTO> lista = new ArrayList<>();
     private ConexaoDAO conexao = new ConexaoDAO();
     
     public void cadastrarEquipamento(EquipamentosDTO objEquipamentosDTO){
            String sql = "INSERT INTO equipamentos (dados_usina, potencia, marca) values (?, ?, ?)";
         try {
          PreparedStatement pstm = conexao.getConnection().prepareStatement(sql);
            pstm.setString(1, objEquipamentosDTO.getDados());
            pstm.setString(2, objEquipamentosDTO.getPotencia());
            pstm.setString(3, objEquipamentosDTO.getMarca());
            
            pstm.execute();
            pstm.close();
          
         } catch (Exception e) {
             System.out.println("Erro equipamentosDAO");
         }
     }
     
       public ArrayList<EquipamentosDTO> PesquisarEquipamentos() {
       String sql = "SELECT * FROM equipamentos";
     
       try {
           PreparedStatement pstm = conexao.getConnection().prepareStatement(sql);
           ResultSet rs = pstm.executeQuery();
           while(rs.next()) {
               EquipamentosDTO objequipamentosDTO = new EquipamentosDTO();
               objequipamentosDTO.setId(rs.getInt("ID"));
               objequipamentosDTO.setDados(rs.getString("dados_usina"));
               objequipamentosDTO.setPotencia(rs.getString("potencia"));
               objequipamentosDTO.setMarca(rs.getString("marca"));
            
               lista.add(objequipamentosDTO);    
               
           }
       } catch (SQLException erro) {
           System.out.println("Erro UsuarioDAO pesquisar");
       }
       return lista;
   } 
      public void ExcluirProduto(EquipamentosDTO objEquipamentosDTO) {
         String sql = "delete from equipamentos where ID = ?";
         try {
             PreparedStatement pstm = conexao.getConnection().prepareStatement(sql);
             pstm.setInt(1, objEquipamentosDTO.getId());
             pstm.execute();
             pstm.close();
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Produto não encontrado");
         }
         
     }
      
}
