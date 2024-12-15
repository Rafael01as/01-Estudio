/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Estudio;

/**
 *
 * @author Rafa
 */
public class Reserva_Gravacao {
    
    private int ID_RESERVA_GRA;
    private String VALOR_RESERVA_GRA;
    private String DATA_RESERVA_GRA;
    private String HORA_ENTRADA_RESERVA_GRA;
    private String HORA_SAIDA_RESERVA_GRA;
    
    public Reserva_Gravacao (int id_reserva_gra, String valor_reserva_gra, String data_reserva_gra, String hora_entrada_reserva_gra, String hora_saida_reserva_gra) {
        
        this.ID_RESERVA_GRA = id_reserva_gra;
        this.VALOR_RESERVA_GRA = valor_reserva_gra;
        this.DATA_RESERVA_GRA = data_reserva_gra;
        this.HORA_ENTRADA_RESERVA_GRA = hora_entrada_reserva_gra;
        this.HORA_SAIDA_RESERVA_GRA = hora_saida_reserva_gra;
    }
    
    public Reserva_Gravacao (){
        
    }
    
    public Reserva_Gravacao (String valor_reserva_gra, String data_reserva_gra, String hora_entrada_reserva_gra, String hora_saida_reserva_gra){
        
        this.VALOR_RESERVA_GRA = valor_reserva_gra;
        this.DATA_RESERVA_GRA = data_reserva_gra;
        this.HORA_ENTRADA_RESERVA_GRA = hora_entrada_reserva_gra;
        this.HORA_SAIDA_RESERVA_GRA = hora_saida_reserva_gra;
    }

    public String getDATA_RESERVA_GRA() {
        return DATA_RESERVA_GRA;
    }

    public void setDATA_RESERVA_GRA(String DATA_RESERVA_GRA) {
        this.DATA_RESERVA_GRA = DATA_RESERVA_GRA;
    }

    public String getHORA_ENTRADA_RESERVA_GRA() {
        return HORA_ENTRADA_RESERVA_GRA;
    }

    public void setHORA_ENTRADA_RESERVA_GRA(String HORA_ENTRADA_RESERVA_GRA) {
        this.HORA_ENTRADA_RESERVA_GRA = HORA_ENTRADA_RESERVA_GRA;
    }

    public String getHORA_SAIDA_RESERVA_GRA() {
        return HORA_SAIDA_RESERVA_GRA;
    }

    public void setHORA_SAIDA_RESERVA_GRA(String HORA_SAIDA_RESERVA_GRA) {
        this.HORA_SAIDA_RESERVA_GRA = HORA_SAIDA_RESERVA_GRA;
    }

    public int getID_RESERVA_GRA() {
        return ID_RESERVA_GRA;
    }

    public void setID_RESERVA_GRA(int ID_RESERVA_GRA) {
        this.ID_RESERVA_GRA = ID_RESERVA_GRA;
    }

    public String getVALOR_RESERVA_GRA() {
        return VALOR_RESERVA_GRA;
    }

    public void setVALOR_RESERVA_GRA(String VALOR_RESERVA_GRA) {
        this.VALOR_RESERVA_GRA = VALOR_RESERVA_GRA;
    }
    
    
}
