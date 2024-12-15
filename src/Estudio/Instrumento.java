/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Estudio;

/**
 *
 * @author Rafa
 */
public class Instrumento {
    
    private int ID_INS;
    private String VALOR_INS;
    private String DESCRICAO_INS;
    private String DATA_HORA_SAIDA_INS;
    private String DATA_HORA_RETORNO_INS;
 
    
    public Instrumento (int id_ins, String valor_ins, String descricao_ins, String data_hora_saida_ins, String data_hora_retorno_ins) {
        
        this.ID_INS = id_ins;
        this.VALOR_INS = valor_ins;
        this.DESCRICAO_INS = descricao_ins;
        this.DATA_HORA_SAIDA_INS = data_hora_saida_ins;
        this.DATA_HORA_RETORNO_INS = data_hora_retorno_ins;
    }
    
    public Instrumento (){
        
    }
    
    public Instrumento ( String valor_ins, String descricao_ins, String data_hora_saida_ins, String data_hora_retorno_ins){
        
        this.VALOR_INS = valor_ins;
        this.DESCRICAO_INS = descricao_ins;
        this.DATA_HORA_SAIDA_INS = data_hora_saida_ins;
        this.DATA_HORA_RETORNO_INS = data_hora_retorno_ins;
    }

    public String getDATA_HORA_RETORNO_INS() {
        return DATA_HORA_RETORNO_INS;
    }

    public void setDATA_HORA_RETORNO_INS(String DATA_HORA_RETORNO_INS) {
        this.DATA_HORA_RETORNO_INS = DATA_HORA_RETORNO_INS;
    }

    public String getDATA_HORA_SAIDA_INS() {
        return DATA_HORA_SAIDA_INS;
    }

    public void setDATA_HORA_SAIDA_INS(String DATA_HORA_SAIDA_INS) {
        this.DATA_HORA_SAIDA_INS = DATA_HORA_SAIDA_INS;
    }

    public String getDESCRICAO_INS() {
        return DESCRICAO_INS;
    }

    public void setDESCRICAO_INS(String DESCRICAO_INS) {
        this.DESCRICAO_INS = DESCRICAO_INS;
    }

    public int getID_INS() {
        return ID_INS;
    }

    public void setID_INS(int ID_INS) {
        this.ID_INS = ID_INS;
    }

    public String getVALOR_INS() {
        return VALOR_INS;
    }

    public void setVALOR_INS(String VALOR_INS) {
        this.VALOR_INS = VALOR_INS;
    }
    
    
    
}
