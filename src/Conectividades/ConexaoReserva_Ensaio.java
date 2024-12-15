/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conectividades;
import Estudio.Reserva_Ensaio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Rafa
 */
public class ConexaoReserva_Ensaio {
    private final String fonte = "jdbc:mysql://localhost/01estudio";
    private final String driver = "com.mysql.jdbc.Driver";
    private final String usuario = "root";
    private final String senha = "";
    private Connection con;
    private PreparedStatement stm;
    
public void cadastrarReserva_Ensaio(Reserva_Ensaio reserva_ensaio) throws SQLException{
    this.con = DriverManager.getConnection(fonte, this.usuario, this.senha);
    this.stm = this.con.prepareStatement(" INSERT INTO " + " reserva_Ensaio (valor_reserva_ens, data_reserva_ens, hora_entrada_reserva_ens, hora_saida_reserva_ens)" + "values(?,?,?,?)");
    this.stm.setString(1, reserva_ensaio.getVALOR_RESERVA_ENS());
    this.stm.setString(2, reserva_ensaio.getDATA_RESERVA_ENS());
    this.stm.setString(3, reserva_ensaio.getHORA_ENTRADA_RESERVA_ENS());
    this.stm.setString(4, reserva_ensaio.getHORA_SAIDA_RESERVA_ENS());
    this.stm.execute();
    this.stm.close();
            
 }
public Reserva_Ensaio buscarreserva_ensaio(int Id_Reserva_Ens)throws SQLException{
   this.con = DriverManager.getConnection(fonte, this.usuario, this.senha);
   this.stm = this.con.prepareStatement("SELECT * FROM reserva_ensaio "+" WHERE id_reserva_ens = ?");
   
   this.stm.setInt(1, Id_Reserva_Ens);
   ResultSet rs = this.stm.executeQuery();
  Reserva_Ensaio reserva_ensaio = new Reserva_Ensaio();
 
   while(rs.next()){
       reserva_ensaio.setID_RESERVA_ENS(rs.getInt("id_reserva_ens"));
       reserva_ensaio.setVALOR_RESERVA_ENS(rs.getString("valor_reserva_ens"));
       reserva_ensaio.setDATA_RESERVA_ENS(rs.getString("data_reserva_ens"));
       reserva_ensaio.setHORA_ENTRADA_RESERVA_ENS(rs.getString("hora_entrada_reserva_ens"));
       reserva_ensaio.setHORA_SAIDA_RESERVA_ENS(rs.getString("hora_saida_reserva_ens"));
    
      }
   this.con.close();
   return reserva_ensaio;
}
public void AtualizarReserva_Ensaio (Reserva_Ensaio reserva_ensaio, int id_reserva_ens) throws SQLException{
    this.con = DriverManager.getConnection(fonte, this.usuario, this.senha);
    this.stm = this.con.prepareStatement("UPDATE reserva_ensaio SET valor_reserva_ens = ?, "+" data_reserva_ens = ?, hora_entrada_reserva_ens = ?, hora_saida_reserva_ens = ? WHERE id_reserva_ens = ?");
    
    this.stm.setString(1, reserva_ensaio.getVALOR_RESERVA_ENS());
    this.stm.setString(2, reserva_ensaio.getDATA_RESERVA_ENS());
    this.stm.setString(3, reserva_ensaio.getHORA_ENTRADA_RESERVA_ENS());
    this.stm.setString(4, reserva_ensaio.getHORA_SAIDA_RESERVA_ENS());
    
    this.stm.setInt(5, id_reserva_ens);
    this.stm.executeUpdate();
    this.con.close();
}
public void RemoverReserva_Ensaio(int id_reserva_ens) throws SQLException{
    this.con = DriverManager.getConnection(fonte, this.usuario, this.senha);
    this.stm = this.con.prepareStatement("DELETE FROM Reserva_Ensaio WHERE id_reserva_ens = ?");
    this.stm.setInt(1, id_reserva_ens);
    this.stm.execute();
    this.con.close();
}
    
}
