
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
         String sql = "INSERT INTO equipamentos (codigo, potencia, marca) values (?, ?, ?)";
         try {
          PreparedStatement pstm = conexao.getConnection().prepareStatement(sql);
            pstm.setInt(1, objEquipamentosDTO.getCodigo_produto());
            pstm.setInt(2, objEquipamentosDTO.getPotencia());
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
               objequipamentosDTO.setCodigo_produto(rs.getInt("codigo"));
               objequipamentosDTO.setPotencia(rs.getInt("potencia"));
               objequipamentosDTO.setMarca(rs.getString("marca"));
            
               lista.add(objequipamentosDTO);    
               
           }
       } catch (SQLException erro) {
           System.out.println("Erro UsuarioDAO pesquisar");
       }
       return lista;
   } 
      public void ExcluirProduto(EquipamentosDTO objEquipamentosDTO) {
         String sql = "delete from equipamentos where codigo = ?";
         try {
             PreparedStatement pstm = conexao.getConnection().prepareStatement(sql);
             pstm.setInt(1, objEquipamentosDTO.getCodigo_produto());
             pstm.execute();
             pstm.close();
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Produto não encontrado");
         }
         
     }
      
}
