/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conectividades;
import Estudio.Reserva_Gravacao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


        
        
/**
 *
 * @author Rafa
 */
public class ConexaoReserva_Gravacao {
    private final String fonte = "jdbc:mysql://localhost/01estudio";
    private final String driver = "com.mysql.jdbc.Driver";
    private final String usuario = "root";
    private final String senha = "";
    private Connection con;
    private PreparedStatement stm;
    
public void cadastrarReserva_Gravacao(Reserva_Gravacao reserva_gravacao) throws SQLException{
    this.con = DriverManager.getConnection(fonte, this.usuario, this.senha);
    this.stm = this.con.prepareStatement(" INSERT INTO " + " reserva_gravacao (valor_reserva_gra, data_reserva_gra, hora_entrada_reserva_gra, hora_saida_reserva_gra)" + "values(?,?,?,?)");
    this.stm.setString(1, reserva_gravacao.getVALOR_RESERVA_GRA());
    this.stm.setString(2, reserva_gravacao.getDATA_RESERVA_GRA());
    this.stm.setString(3, reserva_gravacao.getHORA_ENTRADA_RESERVA_GRA());
    this.stm.setString(4, reserva_gravacao.getHORA_SAIDA_RESERVA_GRA());
    this.stm.execute();
    this.stm.close();
            
 }
public Reserva_Gravacao buscarreserva_gravacao(int Id_Reserva_Gra)throws SQLException{
   this.con = DriverManager.getConnection(fonte, this.usuario, this.senha);
   this.stm = this.con.prepareStatement("SELECT * FROM reserva_gravacao "+" WHERE id_reserva_gra = ?");
   
   this.stm.setInt(1, Id_Reserva_Gra);
   ResultSet rs = this.stm.executeQuery();
  Reserva_Gravacao reserva_gravacao = new Reserva_Gravacao();
 
   while(rs.next()){
       reserva_gravacao.setID_RESERVA_GRA(rs.getInt("id_reserva_gra"));
       reserva_gravacao.setVALOR_RESERVA_GRA(rs.getString("valor_reserva_gra"));
       reserva_gravacao.setDATA_RESERVA_GRA(rs.getString("data_reserva_gra"));
       reserva_gravacao.setHORA_ENTRADA_RESERVA_GRA(rs.getString("hora_entrada_reserva_gra"));
       reserva_gravacao.setHORA_SAIDA_RESERVA_GRA(rs.getString("hora_saida_reserva_gra"));
    
      }
   this.con.close();
   return reserva_gravacao;
}
public void AtualizarReserva_Gravacao (Reserva_Gravacao reserva_gravacao, int id_reserva_gra) throws SQLException{
    this.con = DriverManager.getConnection(fonte, this.usuario, this.senha);
    this.stm = this.con.prepareStatement("UPDATE reserva_gravacao SET valor_reserva_gra = ?, "+" data_reserva_gra = ?, hora_entrada_reserva_gra = ?, hora_saida_reserva_gra = ? WHERE id_reserva_gra = ?");
    
    this.stm.setString(1, reserva_gravacao.getVALOR_RESERVA_GRA());
    this.stm.setString(2, reserva_gravacao.getDATA_RESERVA_GRA());
    this.stm.setString(3, reserva_gravacao.getHORA_ENTRADA_RESERVA_GRA());
    this.stm.setString(4, reserva_gravacao.getHORA_SAIDA_RESERVA_GRA());
    
    this.stm.setInt(5, id_reserva_gra);
    this.stm.executeUpdate();
    this.con.close();
}
public void RemoverReserva_Gravacao(int id_reserva_gra) throws SQLException{
    this.con = DriverManager.getConnection(fonte, this.usuario, this.senha);
    this.stm = this.con.prepareStatement("DELETE FROM Reserva_Gravacao WHERE id_reserva_gra = ?");
    this.stm.setInt(1, id_reserva_gra);
    this.stm.execute();
    this.con.close();
}
}