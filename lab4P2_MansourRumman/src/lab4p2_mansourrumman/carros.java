/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_mansourrumman;

/**
 *
 * @author manso
 */
public abstract class carros {
    private String  modelo,caseria;
    private int VIN,cantp,capm;
    
     public carros() {
    }

    public carros(String modelo, String caseria, int VIN, int cantp, int capm) {
        this.modelo = modelo;
        this.caseria = caseria;
        this.VIN = VIN;
        this.cantp = cantp;
        this.capm = capm;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCaseria() {
        return caseria;
    }

    public void setCaseria(String caseria) {
        this.caseria = caseria;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public int getCantp() {
        return cantp;
    }

    public void setCantp(int cantp) {
        this.cantp = cantp;
    }

    public int getCapm() {
        return capm;
    }

    public void setCapm(int capm) {
        this.capm = capm;
    }

    @Override
    public String toString() {
        return "carros{" + "modelo=" + modelo + ", caseria=" + caseria + ", VIN=" + VIN + ", cantp=" + cantp + ", capm=" + capm + '}';
    }
    
    public abstract int calc()throws excepcion;    
}
