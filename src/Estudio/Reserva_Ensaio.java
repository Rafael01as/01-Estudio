/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Estudio;

/**
 *
 * @author Rafa
 */
public class Reserva_Ensaio {
    
     private int ID_RESERVA_ENS;
    private String VALOR_RESERVA_ENS;
    private String DATA_RESERVA_ENS;
    private String HORA_ENTRADA_RESERVA_ENS;
    private String HORA_SAIDA_RESERVA_ENS;
    
    public Reserva_Ensaio (int id_reserva_ens, String valor_reserva_ens, String data_reserva_ens, String hora_entrada_reserva_ens, String hora_saida_reserva_ens) {
        
        this.ID_RESERVA_ENS = id_reserva_ens;
        this.VALOR_RESERVA_ENS = valor_reserva_ens;
        this.DATA_RESERVA_ENS = data_reserva_ens;
        this.HORA_ENTRADA_RESERVA_ENS = hora_entrada_reserva_ens;
        this.HORA_SAIDA_RESERVA_ENS = hora_saida_reserva_ens;
    }
    
    public Reserva_Ensaio (){
        
    }
    
    public Reserva_Ensaio (String valor_reserva_ens, String data_reserva_ens, String hora_entrada_reserva_ens, String hora_saida_reserva_ens){
        
        this.VALOR_RESERVA_ENS = valor_reserva_ens;
        this.DATA_RESERVA_ENS = data_reserva_ens;
        this.HORA_ENTRADA_RESERVA_ENS = hora_entrada_reserva_ens;
        this.HORA_SAIDA_RESERVA_ENS = hora_saida_reserva_ens;
    }

    public String getDATA_RESERVA_ENS() {
        return DATA_RESERVA_ENS;
    }

    public void setDATA_RESERVA_ENS(String DATA_RESERVA_ENS) {
        this.DATA_RESERVA_ENS = DATA_RESERVA_ENS;
    }

    public String getHORA_ENTRADA_RESERVA_ENS() {
        return HORA_ENTRADA_RESERVA_ENS;
    }

    public void setHORA_ENTRADA_RESERVA_ENS(String HORA_ENTRADA_RESERVA_ENS) {
        this.HORA_ENTRADA_RESERVA_ENS = HORA_ENTRADA_RESERVA_ENS;
    }

    public String getHORA_SAIDA_RESERVA_ENS() {
        return HORA_SAIDA_RESERVA_ENS;
    }

    public void setHORA_SAIDA_RESERVA_ENS(String HORA_SAIDA_RESERVA_ENS) {
        this.HORA_SAIDA_RESERVA_ENS = HORA_SAIDA_RESERVA_ENS;
    }

    public int getID_RESERVA_ENS() {
        return ID_RESERVA_ENS;
    }

    public void setID_RESERVA_ENS(int ID_RESERVA_ENS) {
        this.ID_RESERVA_ENS = ID_RESERVA_ENS;
    }

    public String getVALOR_RESERVA_ENS() {
        return VALOR_RESERVA_ENS;
    }

    public void setVALOR_RESERVA_ENS(String VALOR_RESERVA_ENS) {
        this.VALOR_RESERVA_ENS = VALOR_RESERVA_ENS;
    }
    
    
}
