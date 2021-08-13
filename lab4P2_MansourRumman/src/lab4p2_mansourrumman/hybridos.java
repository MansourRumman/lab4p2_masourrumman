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
public  class hybridos extends carros{
    private int cbat,cmot;

    public hybridos() {
        super();
    }

    public hybridos(int cbat, int cmot, String modelo, String caseria, int VIN, int cantp, int capm) {
        super(modelo, caseria, VIN, cantp, capm);
        this.cbat = cbat;
        this.cmot = cmot;
    }

    public int getCbat() {
        return cbat;
    }

    public void setCbat(int cbat) {
        this.cbat = cbat;
    }

    public int getCmot() {
        return cmot;
    }

    public void setCmot(int cmot) {
        this.cmot = cmot;
    }

    @Override
    public String toString() {
        return "hybridos{" + "cbat=" + cbat + ", cmot=" + cmot + '}';
    }
    public int calc()throws excepcion{
      int x= 2021-((cbat*super.getCapm()))/super.getCantp();
       if(x>30){
            throw new excepcion(" se desgasta muy rapido");
        }
        return x;
    }
}
