/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conectividades;
import Estudio.Instrumento;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 *
 * @author Rafa
 */
public class ConexaoInstrumento {
    private final String fonte = "jdbc:mysql://localhost/01estudio";
    private final String driver = "com.mysql.jdbc.Driver";
    private final String usuario = "root";
    private final String senha = "";
    private Connection con;
    private PreparedStatement stm;
    
public void cadastrarInstrumento(Instrumento instrumento) throws SQLException{
    this.con = DriverManager.getConnection(fonte, this.usuario, this.senha);
    this.stm = this.con.prepareStatement(" INSERT INTO " + " instrumento (valor_ins, descricao_ins, data_hora_saida_ins, data_hora_retorno_ins)" + "values(?,?,?,?)");
    this.stm.setString(1, instrumento.getVALOR_INS());
    this.stm.setString(2, instrumento.getDESCRICAO_INS());
    this.stm.setString(3, instrumento.getDATA_HORA_SAIDA_INS());
    this.stm.setString(4, instrumento.getDATA_HORA_RETORNO_INS());
    this.stm.execute();
    this.stm.close();
            
 } 

public Instrumento buscarinstrumento(int Id_Ins)throws SQLException{
   this.con = DriverManager.getConnection(fonte, this.usuario, this.senha);
   this.stm = this.con.prepareStatement("SELECT * FROM instrumento "+"WHERE id_ins = ?");
   
   this.stm.setInt(1, Id_Ins);
   ResultSet rs = this.stm.executeQuery();
   Instrumento instrumento = new Instrumento();
 
   while(rs.next()){
       instrumento.setID_INS(rs.getInt("id_ins"));
       instrumento.setVALOR_INS(rs.getString("valor_ins"));
       instrumento.setDESCRICAO_INS(rs.getString("descricao_ins"));
       instrumento.setDATA_HORA_SAIDA_INS(rs.getString("data_hora_saida_ins"));
       instrumento.setDATA_HORA_RETORNO_INS(rs.getString("data_hora_retorno_ins"));
      
       
   }
   this.con.close();
   return instrumento;
}

public void AtualizarInstrumento(Instrumento instrumento, int Id_Ins) throws SQLException{
    this.con = DriverManager.getConnection(fonte, this.usuario, this.senha);
    this.stm = this.con.prepareStatement("UPDATE instrumento SET valor_ins = ?, "+" descricao_ins = ?, data_hora_saida_ins = ?, data_hora_retorno_ins = ? WHERE id_ins = ?");
    
    this.stm.setString(1, instrumento.getVALOR_INS());
    this.stm.setString(2, instrumento.getDESCRICAO_INS());
    this.stm.setString(3, instrumento.getDATA_HORA_SAIDA_INS());
    this.stm.setString(4, instrumento.getDATA_HORA_RETORNO_INS());
    this.stm.setInt(5, Id_Ins);
    this.stm.executeUpdate();
    this.con.close();
}

public void RemoverInstrumento(int id_Ins) throws SQLException{
    this.con = DriverManager.getConnection(fonte, this.usuario, this.senha);
    this.stm = this.con.prepareStatement("DELETE FROM Instrumento WHERE id_Ins = ?");
    this.stm.setInt(1, id_Ins);
    this.stm.execute();
    this.con.close();
}
    
    
}
