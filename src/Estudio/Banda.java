
package Estudio;

/**
 *
 * @author Rafa
 */
// Classe Banda
public class Banda {
    
    private int ID_BAN;
    private String NOME_BAN;
    private String FONE_BAN;
    private String EMAIL_BAN;
    private String GENERO_BAN;
    private String RESPONSAVEL_BAN;
    private String RUA_BAN;
    private String NUMERO_BAN;
    
    public Banda(int id_ban,String nome_ban,String fone_ban,String email_ban,String genero_ban,String responsavel_ban,String rua_ban,String numero_ban){
        this.ID_BAN = id_ban;
        this.NOME_BAN = nome_ban;
        this.FONE_BAN = fone_ban;
        this.EMAIL_BAN = email_ban;
        this.GENERO_BAN = genero_ban;
        this.RESPONSAVEL_BAN = responsavel_ban;
        this.RUA_BAN = rua_ban;
        this.NUMERO_BAN = numero_ban;
        
    }
    
    public Banda (){
        
    }
    public Banda (String nome_ban,String fone_ban,String email_ban,String genero_ban,String responsavel_ban,String rua_ban, String numero_ban){
        this.NOME_BAN = nome_ban;
        this.FONE_BAN = fone_ban;
        this.EMAIL_BAN = email_ban;
        this.GENERO_BAN = genero_ban;
        this.RESPONSAVEL_BAN = responsavel_ban;
        this.RUA_BAN = rua_ban;
        this.NUMERO_BAN = numero_ban;
        
        
        }

    public String getEMAIL_BAN() {
        return EMAIL_BAN;
    }

    public void setEMAIL_BAN(String EMAIL_BAN) {
        this.EMAIL_BAN = EMAIL_BAN;
    }

    public String getFONE_BAN() {
        return FONE_BAN;
    }

    public void setFONE_BAN(String FONE_BAN) {
        this.FONE_BAN = FONE_BAN;
    }

    public String getGENERO_BAN() {
        return GENERO_BAN;
    }

    public void setGENERO_BAN(String GENERO_BAN) {
        this.GENERO_BAN = GENERO_BAN;
    }

    public int getID_BAN() {
        return ID_BAN;
    }

    public void setID_BAN(int ID_BAN) {
        this.ID_BAN = ID_BAN;
    }

    public String getNOME_BAN() {
        return NOME_BAN;
    }

    public void setNOME_BAN(String NOME_BAN) {
        this.NOME_BAN = NOME_BAN;
    }

    public String getRESPONSAVEL_BAN() {
        return RESPONSAVEL_BAN;
    }

    public void setRESPONSAVEL_BAN(String RESPONSAVEL_BAN) {
        this.RESPONSAVEL_BAN = RESPONSAVEL_BAN;
    }
    
    public String getRUA_BAN() {
        return RUA_BAN;
    }
    
    public void setRUA_BAN(String RUA_BAN) {
        this.RUA_BAN = RUA_BAN;
    }
    
    public String getNUMERO_BAN() {
        return NUMERO_BAN;
    }
    
    public void setNUMERO_BAN(String NUMERO_BAN) {
        this.NUMERO_BAN = NUMERO_BAN;
    }
   
}
