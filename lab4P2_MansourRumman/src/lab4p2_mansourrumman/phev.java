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
public  class phev extends carros{
       private String tipo;
    private int cank, cmotores, cremol;

    public phev() {
        super();
    }

    public phev(String tipo, int cank, int cmotores, int cremol, String modelo, String caseria, int VIN, int cantp, int capm) {
        super(modelo, caseria, VIN, cantp, capm);
        this.tipo = tipo;
        this.cank = cank;
        this.cmotores = cmotores;
        this.cremol = cremol;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCank() {
        return cank;
    }

    public void setCank(int cank) {
        this.cank = cank;
    }

    public int getCmotores() {
        return cmotores;
    }

    public void setCmotores(int cmotores) {
        this.cmotores = cmotores;
    }

    public int getCremol() {
        return cremol;
    }

    public void setCremol(int cremol) {
        this.cremol = cremol;
    }

    @Override
    public String toString() {
        return "phev{" + "es de 4x4=" + tipo + ", cank=" + cank + ", cmotores=" + cmotores + ", cremol=" + cremol + '}';
    }

public int calc()throws excepcion{
      int x= 2021-((super.getCantp())*cmotores)+(cank/cremol);
       if(x>30){
            throw new excepcion(" se desgasta muy rapido");
        }
        return x;
    }
    
}
