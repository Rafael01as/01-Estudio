/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conectividades;
import Estudio.Banda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


        
        
/**
 *
 * @author Rafa
 */
public class ConexaoBanda {
    private final String fonte = "jdbc:mysql://localhost/01estudio";
    private final String driver = "com.mysql.jdbc.Driver";
    private final String usuario = "root";
    private final String senha = "";
    private Connection con;
    private PreparedStatement stm;
    
public void cadastrarBanda(Banda banda) throws SQLException{
    this.con = DriverManager.getConnection(fonte, this.usuario, this.senha);
    this.stm = this.con.prepareStatement(" INSERT INTO " + " banda (nome_ban, fone_ban, email_ban, genero_ban, responsavel_ban, rua_ban, numero_ban)" + "values(?,?,?,?,?,?,?)");
    this.stm.setString(1, banda.getNOME_BAN());
    this.stm.setString(2, banda.getFONE_BAN());
    this.stm.setString(3, banda.getEMAIL_BAN());
    this.stm.setString(4, banda.getGENERO_BAN());
    this.stm.setString(5, banda.getRESPONSAVEL_BAN());
    this.stm.setString(6, banda.getRUA_BAN());
    this.stm.setString(7, banda.getNUMERO_BAN());
    this.stm.execute();
    this.stm.close();
            
 } 

public Banda buscarbanda(int Id_Ban)throws SQLException{
   this.con = DriverManager.getConnection(fonte, this.usuario, this.senha);
   this.stm = this.con.prepareStatement("SELECT *FROM banda "+"WHERE id_ban = ?");
   
   this.stm.setInt(1, Id_Ban);
   ResultSet rs = this.stm.executeQuery();
   Banda banda = new Banda();
 
   while(rs.next()){
       banda.setID_BAN(rs.getInt("id_ban"));
       banda.setNOME_BAN(rs.getString("nome_ban"));
       banda.setFONE_BAN(rs.getString("fone_ban"));
       banda.setEMAIL_BAN(rs.getString("email_ban"));
       banda.setGENERO_BAN(rs.getString("genero_ban"));
       banda.setRESPONSAVEL_BAN(rs.getString("responsavel_ban"));
       banda.setRUA_BAN(rs.getString("rua_ban"));
       banda.setNUMERO_BAN(rs.getString("numero_ban"));
   }
   this.con.close();
   return banda;
}

public void AtualizarBanda(Banda banda, int id_ban) throws SQLException{
    this.con = DriverManager.getConnection(fonte, this.usuario, this.senha);
    this.stm = this.con.prepareStatement("UPDATE banda SET nome_ban = ?, "+" fone_ban = ?, email_ban = ?, genero_ban = ?, responsavel_ban = ?, rua_ban = ?, numero_ban = ? WHERE id_ban = ?");
    
    this.stm.setString(1, banda.getNOME_BAN());
    this.stm.setString(2, banda.getFONE_BAN());
    this.stm.setString(3, banda.getEMAIL_BAN());
    this.stm.setString(4, banda.getGENERO_BAN());
    this.stm.setString(5, banda.getRESPONSAVEL_BAN());
    this.stm.setString(6, banda.getRUA_BAN());
    this.stm.setString(7, banda.getNUMERO_BAN());
    this.stm.setInt(8, id_ban);
    this.stm.executeUpdate();
    this.con.close();
}

public void RemoverBanda(int id_ban) throws SQLException{
    this.con = DriverManager.getConnection(fonte, this.usuario, this.senha);
    this.stm = this.con.prepareStatement("DELETE FROM Banda WHERE id_ban = ?");
    this.stm.setInt(1, id_ban);
    this.stm.execute();
    this.con.close();
}
    
}
