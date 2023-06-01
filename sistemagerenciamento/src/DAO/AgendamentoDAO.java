

package DAO;
import java.sql.PreparedStatement;
import DTO.AgendamentoDTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class AgendamentoDAO {
    private ConexaoDAO conexao = new ConexaoDAO();
    ArrayList<AgendamentoDTO> lista = new ArrayList<>();

    
    public void CadastrarAgenda(AgendamentoDTO objAgendamentoDTO) {
        String sql = "Insert into agendamento (compromisso, responsavel, cliente, local) values (?, ?, ?, ?)";
        try {
            PreparedStatement pstm = conexao.getConnection().prepareStatement(sql);
            pstm.setString(1, objAgendamentoDTO.getCompromisso());
            pstm.setString(2, objAgendamentoDTO.getResponsavel());
            pstm.setString(3, objAgendamentoDTO.getCliente());
            pstm.setString(4, objAgendamentoDTO.getLocal());
             pstm.execute();
            pstm.close();
        } catch (Exception e) {
        }
    }
 
         public ArrayList<AgendamentoDTO> PesquisarAgenda() {
          String sql = "SELECT * FROM agendamento";
         try {
              PreparedStatement pstm = conexao.getConnection().prepareStatement(sql);
              ResultSet rs = pstm.executeQuery();
              while(rs.next()) {
               AgendamentoDTO objAgendamentoDTO = new AgendamentoDTO();
               objAgendamentoDTO.setCodigo(rs.getInt("codigo"));
               objAgendamentoDTO.setCompromisso(rs.getString("compromisso"));
               objAgendamentoDTO.setResponsavel(rs.getString("responsavel"));
               objAgendamentoDTO.setCliente(rs.getString("cliente"));
               objAgendamentoDTO.setLocal(rs.getString("local"));
               lista.add(objAgendamentoDTO);
              }
         } catch (Exception e) {
             System.out.println("Erro AgendamentoDAO pesquisar");
         }
         return lista;
     }
         
      public void ExcluirAgenda(AgendamentoDTO objAgendamentoDTO) {
         String sql = "delete from agendamento where codigo = ?";
         try {
             PreparedStatement pstm = conexao.getConnection().prepareStatement(sql);
             pstm.setInt(1, objAgendamentoDTO.getCodigo());
             pstm.execute();
             pstm.close();
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Agendamento não encontrado");
         }
         
     }
}    
         
     

