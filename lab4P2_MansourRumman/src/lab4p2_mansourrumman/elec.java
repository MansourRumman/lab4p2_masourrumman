/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_mansourrumman;

public  class elec extends carros {
    private int auto, bat, acel, durar;
    public elec() {
        super();
    }

    public elec(int auto, int bat, int acel, int durar, String modelo, String caseria, int VIN, int cantp, int capm) {
        super(modelo, caseria, VIN, cantp, capm);
        this.auto = auto;
        this.bat = bat;
        this.acel = acel;
        this.durar = durar;
    }

    public int getAuto() {
        return auto;
    }

    public void setAuto(int auto) {
        this.auto = auto;
    }

    public int getBat() {
        return bat;
    }

    public void setBat(int bat) {
        this.bat = bat;
    }

    public int getAcel() {
        return acel;
    }

    public void setAcel(int acel) {
        this.acel = acel;
    }

    public int getDurar() {
        return durar;
    }

    public void setDurar(int durar) {
        this.durar = durar;
    }

    @Override
    public String toString() {
        return "elec{" + "auto=" + auto + ", bat=" + bat + ", acel=" + acel + ", durar=" + durar + '}';
    }
    public int calc()throws excepcion{
      int x= 2021-((bat+durar)*(super.getCantp()/acel));
       if(x>30){
            throw new excepcion(" se desgasta muy rapido");
        }
        return x;
    }
    
}
