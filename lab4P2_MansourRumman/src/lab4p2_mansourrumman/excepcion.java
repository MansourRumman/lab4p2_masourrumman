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
public class excepcion extends Exception {
     private String texto;
     
    public excepcion() {
        super();
    }

    public excepcion( String texto) {
        super(texto);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return super.toString()+" miExcepcion{" + "texto=" + texto+ '}';
    }
    
}
