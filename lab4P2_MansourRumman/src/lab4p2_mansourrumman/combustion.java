/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_mansourrumman;


public class combustion extends carros {
       private String cambio;
    private int concomb, durara, maxv;

    public combustion() {
        super();
    }

    public combustion(String cambio, int concomb, int durara, int maxv, String modelo, String caseria, int VIN, int cantp, int capm) {
        super(modelo, caseria, VIN, cantp, capm);
        this.cambio = cambio;
        this.concomb = concomb;
        this.durara = durara;
        this.maxv = maxv;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public int getConcomb() {
        return concomb;
    }

    public void setConcomb(int concomb) {
        this.concomb = concomb;
    }

    public int getDurara() {
        return durara;
    }

    public void setDurara(int durara) {
        this.durara = durara;
    }

    public int getMaxv() {
        return maxv;
    }

    public void setMaxv(int maxv) {
        this.maxv = maxv;
    }

    @Override
    public String toString() {
        return "combustion{" + "cambio=" + cambio + ", concomb=" + concomb + ", durara=" + durara + ", maxv=" + maxv + '}';
    }
    public int calc() throws excepcion{
        int x= 2021-((super.getCantp())*concomb)-durara*concomb;
        if(x>30){
            throw new excepcion(" se desgasta muy rapido");
        }
        return x;
    }    
    
}
    
  

